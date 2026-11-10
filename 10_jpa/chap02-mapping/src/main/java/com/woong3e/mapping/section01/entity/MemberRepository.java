package com.woong3e.mapping.section01.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository // 데이터베이스에 접근하는 역할로 스프링에 등록한다.
public class MemberRepository {

    @PersistenceContext // JPA 작업에 사용하는 EntityManager를 스프링이 주입하도록 한다.
    private EntityManager entityManager;

    public Member save(Member member){
        entityManager.persist(member);
        return member;
    }
}
