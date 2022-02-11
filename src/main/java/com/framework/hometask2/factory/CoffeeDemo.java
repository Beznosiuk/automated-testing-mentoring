package com.framework.hometask2.factory;

import javax.annotation.PostConstruct;

public class CoffeeDemo {
    @PostConstruct
    public void demonstrateCoffeeShop() {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        Coffee coffee = coffeeFactory.prepareCoffee("americano");
        System.out.println("We ordered a " + coffee.getName() + "\n");

        coffee = coffeeFactory.prepareCoffee("latte");
        System.out.println("We ordered a " + coffee.getName() + "\n");
    }
}
