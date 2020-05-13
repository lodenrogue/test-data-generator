package com.arkvis.tdg.generator;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CsvBuilderTest {
    private String columnAHeader = "COLUMN_A";
    private String columnBHeader = "COLUMN_B";

    private String columnAData = "ABC";
    private String columnBData = "DEF";

    private int rowCount = 10;

    @Test
    public void should_generateWithCorrectHeaders_when_generatingCsv() {
        Csv csv = new CsvBuilder(rowCount)
                .column(columnAHeader, () -> "ABC")
                .column(columnBHeader, () -> "DEF")
                .build();

        assertNotNull(csv);
        assertNotNull(csv.getHeaders());

        assertEquals(2, csv.getHeaders().size());
        assertEquals(columnAHeader, csv.getHeaders().get(0));
        assertEquals(columnBHeader, csv.getHeaders().get(1));
    }

    @Test
    public void should_generateWithCorrectData_when_generatingCsv() {
        Csv csv = new CsvBuilder(rowCount)
                .column(columnAHeader, () -> columnAData)
                .column(columnBHeader, () -> columnBData)
                .build();

        List<List<String>> rows = csv.getRows();

        assertNotNull(rows);
        assertEquals(rowCount, rows.size());

        rows.forEach(row -> assertEquals(2, row.size()));
        rows.forEach(row -> assertEquals(columnAData, row.get(0)));
        rows.forEach(row -> assertEquals(columnBData, row.get(1)));
    }

    @Test
    public void should_generateCorrectString_when_generatingCsv() {
        int rowCount = 2;

        Csv csv = new CsvBuilder(rowCount)
                .column(columnAHeader, () -> columnAData)
                .column(columnBHeader, () -> columnBData)
                .build();

        String str = csv.toString();
        assertNotNull(str);
        assertEquals(generateTestString(), str);

        System.out.println(str);
    }

    private String generateTestString() {
        String format = "%s,%s\n";
        return String.format(format, columnAHeader, columnBHeader)
                + String.format(format, columnAData, columnBData)
                + String.format(format, columnAData, columnBData);
    }
}
