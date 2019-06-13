package com.naya.demobootmoscow;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

/**
 * @author Evgeny Borisov
 */
public class CustomHeroRepositoryImpl implements CustomHeroRepository {
    @Autowired
    EntityManager entityManager;

    @Override
    public void saveLanister() {
        entityManager.persist(Hero.builder()
                .name("LANISTER")
                .build());
    }
}
