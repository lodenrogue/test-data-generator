package com.arkvis.tdg;

import com.arkvis.tdg.generator.Csv;
import com.arkvis.tdg.generator.CsvBuilder;
import com.arkvis.tdg.supplier.name.FirstNameSupplier;
import com.arkvis.tdg.supplier.name.LastNameSupplier;

import java.util.Random;

public class Example {

    public static void main(String[] args) {
        Csv csv = new CsvBuilder(5)
                .column("FIRST_NAME", new FirstNameSupplier())
                .column("LAST_NAME", new LastNameSupplier())
                .column("CUSTOM", () -> new Random().nextFloat())
                .build();

        System.out.println(csv.toString());
    }
}
