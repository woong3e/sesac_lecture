package com.woong3e.springdatajpa.menu.repository;

import com.woong3e.springdatajpa.menu.dto.CategoryMenuCountView;
import com.woong3e.springdatajpa.menu.dto.MenuPriceRankView;
import com.woong3e.springdatajpa.menu.entity.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

    List<Menu> findByMenuPriceGreaterThanEqualOrderByMenuPriceDesc(int minPrice);

    @Query("SELECT m FROM Menu m " +
            "WHERE m.menuName LIKE CONCAT('%', :keyword, '%') " +
            "ORDER BY m.menuCode")
    List<Menu> searchByMenuName(@Param("keyword") String keyword);

    @Query(
            value = "SELECT m FROM Menu m JOIN FETCH m.category",
            countQuery = "SELECT COUNT(m) FROM Menu m"
    )
    Page<Menu> findPageWithCategory(Pageable pageable);
/*=========================아래부터가 native query=====================*/
    @Query(value = """
SELECT  c.category_Code AS categoryCode,
        c.category_name AS categoryName,
        COUNT(m.menu_code) AS menuCount
FROM tbl_category c
LEFT JOIN tbl_menu m ON m.category_code = c.category_code
GROUP BY c.category_code,c.category_name
ORDER BY menuCount DESC,c.category_code
""",nativeQuery = true)
    List<CategoryMenuCountView> findCategoryMenuCounts();


    // 아예 @NativeQuery라는 어노테이션도 있다.
    @NativeQuery(value = """
        SELECT m.menu_code AS menuCode,
               m.menu_name AS menuName,
               m.menu_price AS menuPrice,
               RANK() OVER (ORDER BY m.menu_price DESC) AS priceRank
          FROM tbl_menu m
         ORDER BY priceRank, m.menu_code
        """)
    List<MenuPriceRankView> findMenuPriceRanks();

}
