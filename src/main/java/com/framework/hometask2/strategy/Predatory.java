package com.framework.hometask2.strategy;

public class Predatory implements FeedBehavior {
    @Override
    public void feed() {
        System.out.println("I eat meat");
    }
}
