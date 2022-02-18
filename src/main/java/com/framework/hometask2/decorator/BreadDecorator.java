package com.framework.hometask2.decorator;

public class BreadDecorator extends Decorator {
    public BreadDecorator(Person person) {
        super(person);
    }

    public void buy() {
        super.buy();
        System.out.println("I need bread");
    }
}
