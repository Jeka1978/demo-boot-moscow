package com.naya.demobootmoscow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
public interface HeroRepository extends JpaRepository<Hero, Long>, CustomHeroRepository {

    List<Hero> findByNameContains(String str);

    default List<String>findNamesUppercased(String str){
        return findByNameContains(str).stream()
                .map(Hero::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
