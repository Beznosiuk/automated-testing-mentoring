package com.framework.hometask2.decorator;

public class MeatDecorator extends Decorator {
    public MeatDecorator(Person person) {
        super(person);
    }

    public void buy() {
        super.buy();
        System.out.println("I need meat");
    }
}
