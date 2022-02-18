package com.framework.hometask2.strategy;

import javax.annotation.PostConstruct;

public class AnimalDemo {

    @PostConstruct
    public void demonstrateAnimals() {
        Animal wolf = new Wolf();
        wolf.display();
        wolf.performMove();
        wolf.performFeed();

        Animal salmon = new Salmon();
        salmon.display();
        salmon.performMove();
        salmon.performFeed();

        Animal sparrow = new Sparrow();
        sparrow.display();
        sparrow.performMove();
        sparrow.performFeed();
    }
}
