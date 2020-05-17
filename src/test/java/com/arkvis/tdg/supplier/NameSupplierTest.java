package com.arkvis.tdg.supplier;

import com.arkvis.tdg.generator.Csv;
import com.arkvis.tdg.generator.CsvBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NameSupplierTest {

    @Test
    public void should_returnFirstName_when_supplying() {
        String name = new FirstNameSupplier().get();
        assertNotNull(name);
    }

    @Test
    public void should_returnLastName_when_supplying() {
        String name = new LastNameSupplier().get();
        assertNotNull(name);
    }

    @Test
    public void should_createCsvWithName_when_creatingCsv() {
        int rowCount = 10;
        Csv csv = new CsvBuilder(rowCount)
                .column("FIRST_NAME", new FirstNameSupplier())
                .column("LAST_NAME", new LastNameSupplier())
                .build();

        assertNotNull(csv);
        assertNotNull(csv.getRows());

        assertEquals(rowCount, csv.getRows().size());
        csv.getRows().forEach(row -> assertNotNull(row.get(0)));
        csv.getRows().forEach(row -> assertNotNull(row.get(1)));
    }
}
