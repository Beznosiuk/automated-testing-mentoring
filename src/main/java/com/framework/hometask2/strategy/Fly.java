package com.framework.hometask2.strategy;

public class Fly implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("I can fly");
    }
}
