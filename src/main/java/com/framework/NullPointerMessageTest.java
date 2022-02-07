package com.framework;

import java.util.List;

public class NullPointerMessageTest {

    public static String createNullPointerException() {
        return List.of("Hello")
                .stream()
                .map(x -> null)
                .toList()
                .get(0)
                .toString();
    }
}
