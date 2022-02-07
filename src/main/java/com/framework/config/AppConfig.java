package com.framework.config;

import com.framework.ExampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class AppConfig {

    @PostConstruct
    public void sayHello() {
        System.out.println("Hello world!");
    }

    @Bean
    public ExampleBean getBean() {
        return new ExampleBean();
    }
}
