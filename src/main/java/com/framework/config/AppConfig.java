package com.framework.config;

import com.framework.hometask1.ExampleBean;
import com.framework.hometask2.decorator.ShoppingDemo;
import com.framework.hometask2.factory.CoffeeDemo;
import com.framework.hometask2.strategy.AnimalDemo;
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

    @Bean
    public AnimalDemo demonstrateAnimalsBean() {
        return new AnimalDemo();
    }

    @Bean
    public ShoppingDemo demonstrateShoppingBean() {
        return new ShoppingDemo();
    }

    @Bean
    public CoffeeDemo demonstrateCoffeeBean() {
        return new CoffeeDemo();
    }

}
