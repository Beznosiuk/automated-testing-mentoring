package com.framework.hometask2.decorator;

import javax.annotation.PostConstruct;

public class ShoppingDemo {

    @PostConstruct
    public void demonstrateShopping() {
        Person person = new MeatDecorator(new CheeseDecorator(new BreadDecorator(new Ira())));
        person.buy();
    }
}
