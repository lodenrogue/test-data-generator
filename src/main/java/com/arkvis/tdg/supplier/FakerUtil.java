package com.arkvis.tdg.supplier;

import com.arkvis.tdg.generator.Csv;
import com.arkvis.tdg.generator.CsvBuilder;
import com.github.javafaker.Faker;

import java.util.Random;

class FakerUtil {

    public static void main(String[] args) {
        Csv csv = new CsvBuilder(5)
                .column("FIRST_NAME", new FirstNameSupplier())
                .column("LAST_NAME", new LastNameSupplier())
                .column("CUSTOM", () -> String.valueOf(new Random().nextFloat()))
                .build();

        System.out.println(csv.toString());
    }

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
