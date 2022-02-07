package com.framework;

import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReflectionTests {

    @Test
    @TestType(name = "UI")
    public void buttonShouldWork() {
        System.out.println("Button works");
    }

    @Test
    @TestType(name = "UI")
    public void buttonShouldNotWork() {
        System.out.println("Button does not work");
    }

    @Test
    @TestType(name = "UI")
    public void formShouldWork() {
        System.out.println("Form works");
    }

    @Test
    @TestType
    public void endpointShouldWork() {
        System.out.println("Endpoint works");
    }

    @Test
    @TestType
    public void endpointShouldNotWork() {
        System.out.println("Endpoint does not work");
    }

    @Test
    public void countUITests() {
        var count = List.of(ReflectionTests.class.getMethods())
                .stream()
                .filter(ReflectionTests::isUI)
                .peek(ReflectionTests::printInfo)
                .count();
        System.out.println("Found tests count: " + count);
    }

    private static boolean isUI(Method method) {
        return Optional.ofNullable(method.getAnnotation(TestType.class))
                .map(a -> a.name().equals("UI"))
                .orElse(false);
    }

    private static void printInfo(Method method) {
        var name = method.getName();
        var modifiers = Modifier.toString(method.getModifiers());
        var parameterTypes = Arrays.asList(method.getParameterTypes());
        Class<?> returnType = method.getReturnType();
        System.out.printf(
                """
                        Signature: %s %s %s
                        Parameters: %s
                        ===
                        """, modifiers, returnType, name, parameterTypes
        );
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    static @interface TestType {
        public String name() default "API";
    }
}
