package com.framework.hometask2.factory;

public abstract class Coffee {
    String name;

    String getName() {
        return name;
    }

    public void grindCoffee() {
        System.out.println("Grinding " + name);
    }

    public void makeCoffee() {
        System.out.println("Making " + name);
    }

    public void pourIntoCup() {
        System.out.println("Pouring " + name);
    }
}
