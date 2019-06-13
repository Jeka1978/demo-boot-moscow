package com.naya.demobootmoscow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Evgeny Borisov
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hero {
    @Id
    @GeneratedValue
    private Long id;

    private int age;
    private String name;
}
