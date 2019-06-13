package com.naya.demobootmoscow;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public interface Abc {
    @Autowired
    default void doX(@Autowired MyS myS){
        myS.doXXXXX();
    }
}
