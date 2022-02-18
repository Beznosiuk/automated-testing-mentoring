package com.framework.hometask2.strategy;

public class Sparrow extends Animal {
    public Sparrow() {
        setMoveBehavior(new Fly());
        setFeedBehavior(new Herbivorous());
    }

    @Override
    public void display() {
        System.out.println("I am sparrow");
    }
}
