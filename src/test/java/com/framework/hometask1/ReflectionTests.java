package com.framework.hometask1;


import com.epam.reportportal.junit5.ReportPortalExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@ExtendWith(ReportPortalExtension.class)
public class ReflectionTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectionTests.class);

    @Test
    @TestType(name = "UI")
    public void buttonShouldWork() {
        System.out.println("Button works");
        LOGGER.info("logger button works");
    }

    @Test
    @TestType(name = "UI")
    public void buttonShouldNotWork() {
        System.out.println("Button does not work");
        LOGGER.info("logger button not works");
    }

    @Test
    @TestType(name = "UI")
    public void formShouldWork() {
        System.out.println("Form works");
        LOGGER.info("logger form works");
    }

    @Test
    @TestType
    public void endpointShouldWork() {
        System.out.println("Endpoint works");
        LOGGER.info("logger endpoint works");
    }

    @Test
    @TestType
    public void endpointShouldNotWork() {
        System.out.println("Endpoint does not work");
        LOGGER.info("logger endpoint not works");
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
