package com.framework.hometask1;

import javax.annotation.PostConstruct;

public class ExampleBean {

    @PostConstruct
    public void sayHelloFromBean() {
        System.out.println("Hello world from Bean!");
    }
}
