package com.naya.demobootmoscow;

import com.naya.demosimplestarter.Conf;
import com.naya.demosimplestarter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableScheduling
public class DemoBootMoscowApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBootMoscowApplication.class, args);
    }

}
