package com.framework.hometask2.strategy;

public class Swim implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("I can swim");
    }
}
