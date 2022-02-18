package com.framework.hometask2.strategy;

public class Herbivorous implements FeedBehavior {

    @Override
    public void feed() {
        System.out.println("I eat plants");
    }
}
