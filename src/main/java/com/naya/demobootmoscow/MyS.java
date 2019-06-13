package com.naya.demobootmoscow;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class MyS {
    @Deprecated
    @Scheduled(fixedDelay = 1000)
    public void doXXXXX(){
        System.out.println("XXXXXXXX");
    }
}
