package com.arkvis.tdg.supplier;

import com.github.javafaker.Faker;

public class FakerUtil {

    private static Faker faker;

    private FakerUtil() {

    }

    public static Faker getInstance() {
        if (faker == null) {
            faker = new Faker();
        }
        return faker;
    }
}
