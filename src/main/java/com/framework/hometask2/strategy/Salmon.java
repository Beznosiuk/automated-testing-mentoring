package com.framework.hometask2.strategy;

public class Salmon extends Animal {
    public Salmon() {
        setMoveBehavior(new Swim());
        setFeedBehavior(new Predatory());
    }

    @Override
    public void display() {
        System.out.println("I am Salmon");
    }
}
