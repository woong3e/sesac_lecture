package com.woong3e.section03.entity;

import com.woong3e.section03.entity.EntityManagerGenerator;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntityLifecycleTests {

    private EntityManager entityManager;
    private EntityTransaction transaction;
    private EntityLifecycle lifecycle;

    @BeforeEach
    void setUp() {
        entityManager = EntityManagerGenerator.getInstance();
        transaction = entityManager.getTransaction();
        transaction.begin();
        lifecycle = new EntityLifecycle(entityManager);
    }

    @AfterEach
    void tearDown() {
        if (transaction != null && transaction.isActive()) {
            transaction.rollback();
        }
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }

    @Test
    @DisplayName("비영속 객체와 영속 객체 비교")
    void testTransientAndManaged() {
        // when
        Menu managedMenu = lifecycle.findMenuByMenuCode(2);
        Menu transientMenu = new Menu(
                managedMenu.getMenuCode(),
                managedMenu.getMenuName(),
                managedMenu.getMenuPrice(),
                managedMenu.getCategoryCode(),
                managedMenu.getOrderableStatus()
        );

        // then
        assertTrue(lifecycle.isManaged(managedMenu));
        assertFalse(lifecycle.isManaged(transientMenu));
    }

    @Test
    @DisplayName("서로 다른 EntityManager가 조회한 엔티티 비교")
    void testManagedByDifferentEntityManagers() {
        // given
        EntityManager otherEntityManager = EntityManagerGenerator.getInstance();

        // when
        Menu menu1 = entityManager.find(Menu.class, 3);
        Menu menu2 = otherEntityManager.find(Menu.class, 3);

        // then
        assertNotSame(menu1, menu2);
    }

    @Test
    @DisplayName("같은 EntityManager에서 동일한 엔티티 조회")
    void testManagedBySameEntityManager() {
        // when
        Menu menu1 = entityManager.find(Menu.class, 3);
        Menu menu2 = entityManager.find(Menu.class, 3);

        // then
        assertSame(menu1, menu2);
    }

    @Test
    @DisplayName("detach(준영속) 후 변경 감지가 동작하지 않는지 확인")
    void testDetachEntity() {
        // given
        Menu foundMenu = entityManager.find(Menu.class, 10);
        int originalPrice = foundMenu.getMenuPrice();

        // when
        entityManager.detach(foundMenu);
        foundMenu.setMenuPrice(originalPrice + 1_000);
        entityManager.flush();

        // then
        Menu reloadedMenu = entityManager.find(Menu.class, 10);
        assertEquals(originalPrice, reloadedMenu.getMenuPrice());
        assertFalse(entityManager.contains(foundMenu));
    }

    @Test
    @DisplayName("merge가 반환한 새로운 영속 객체 확인")
    void testMergeEntity() {
        // given
        Menu detachedMenu = entityManager.find(Menu.class, 10);
        entityManager.detach(detachedMenu); // 준영속화
        detachedMenu.setMenuName("병합된 메뉴 이름");

        // when
        // merge는 전달한 준영속 객체의 상태를 복사한 영속 객체를 반환한다.
        // detachedMenu 자체가 다시 관리되는 것은 아니다.
        Menu mergedMenu = entityManager.merge(detachedMenu);
        entityManager.flush();  // DB에 동기화
        // then
        assertFalse(entityManager.contains(detachedMenu));
        assertTrue(entityManager.contains(mergedMenu));
        assertNotSame(detachedMenu, mergedMenu);
        assertEquals("병합된 메뉴 이름", mergedMenu.getMenuName());
    }

    @Test
    @DisplayName("clear 후 같은 엔티티를 다시 조회하면 새 객체가 반환되는지 확인")
    void testClearPersistenceContext() {
        // given
        Menu firstMenu = entityManager.find(Menu.class, 5);

        // when
        entityManager.clear();
        Menu secondMenu = entityManager.find(Menu.class, 5);

        // then
        assertFalse(entityManager.contains(firstMenu));
        assertNotSame(firstMenu, secondMenu);
    }

    @Test
    @DisplayName("remove로 엔티티를 삭제 상태로 전환")
    void testRemoveEntity(){
        // given
        Menu foundMenu = entityManager.find(Menu.class, 6);

        // when
        entityManager.remove(foundMenu);
        entityManager.flush();
        entityManager.clear();

        // then
        assertNull(entityManager.find(Menu.class, 6));
    }
}
