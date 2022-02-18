package com.framework.hometask2.decorator;

public class CheeseDecorator extends Decorator {
    public CheeseDecorator(Person person) {
        super(person);
    }

    public void buy() {
        super.buy();
        System.out.println("I need cheese");
    }
}
