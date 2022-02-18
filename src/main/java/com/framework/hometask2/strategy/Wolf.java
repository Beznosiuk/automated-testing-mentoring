package com.framework.hometask2.strategy;

public class Wolf extends Animal {
    public Wolf() {
        setMoveBehavior(new Run());
        setFeedBehavior(new Predatory());
    }

    @Override
    public void display() {
        System.out.println("I am wolf");
    }
}
