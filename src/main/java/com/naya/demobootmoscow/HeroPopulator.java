package com.naya.demobootmoscow;

import com.github.javafaker.Faker;
import com.github.javafaker.GameOfThrones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Service
@Transactional
public class HeroPopulator {
    @Autowired
    private HeroRepository heroRepository;

    private Random random = new Random();

    private GameOfThrones gameOfThrones = new Faker().gameOfThrones();


    @EventListener(ContextRefreshedEvent.class)
    public void initDB() {
        for (int i = 0; i < 100; i++) {
            Hero hero = Hero.builder().age(random.nextInt(100)).name(gameOfThrones.character()).build();
            heroRepository.save(hero);
        }
    }
}










