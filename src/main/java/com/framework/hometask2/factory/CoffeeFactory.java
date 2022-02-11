package com.framework.hometask2.factory;

import java.util.Objects;

public class CoffeeFactory {

    public Coffee prepareCoffee(String type) {
        Coffee coffee = null;

        switch (type) {
            case "americano" -> coffee = new Americano();
            case "latte" -> coffee = new Latte();
            case "cappuccino" -> coffee = new Cappuccino();
        }

        Objects.requireNonNull(coffee).grindCoffee();
        Objects.requireNonNull(coffee).makeCoffee();
        Objects.requireNonNull(coffee).pourIntoCup();
        return coffee;
    }
}
