package com.framework.hometask2.decorator;

public class Decorator implements Person {
    Person person;

    public Decorator(Person person) {
        this.person = person;
    }

    public void buy() {
        person.buy();
    }
}
