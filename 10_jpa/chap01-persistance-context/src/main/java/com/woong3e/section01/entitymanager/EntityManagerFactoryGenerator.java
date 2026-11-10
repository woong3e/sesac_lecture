package com.woong3e.section01.entitymanager;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryGenerator {

    private static final EntityManagerFactory FACTORY
            = Persistence.createEntityManagerFactory("jpatest");

    private EntityManagerFactoryGenerator() {}

    public static EntityManagerFactory getInstance() {
        return FACTORY;
    }
}
