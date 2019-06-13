package com.naya.demobootmoscow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@RestController
public class HeroController {

    @Autowired
    private HeroRepository heroRepository;

    @GetMapping("/hero")
    public List<Hero> getHeroesWithNameWhichContains(@RequestParam("str") String str){
        return heroRepository.findByNameContains(str);

    }
    @GetMapping("/names")
    public List<String> getNamesWhichContains(@RequestParam("str") String str){
        return heroRepository.findNamesUppercased(str);

    }


}
