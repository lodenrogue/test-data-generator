package com.arkvis.tdg.generator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CsvBuilder {

    private Map<String, Supplier<String>> columnMap;
    private int rowCount;
    private Csv csv;

    public CsvBuilder(int rowCount) {
        this.rowCount = rowCount;
        csv = new Csv();
        columnMap = new HashMap<>();
    }

    public CsvBuilder column(String columnName, Supplier<String> supplier) {
        csv.addColumn(columnName);
        columnMap.put(columnName, supplier);
        return this;
    }

    public Csv build() {
        List<List<String>> rows = IntStream.range(0, rowCount)
                .mapToObj(this::generateRow)
                .collect(Collectors.toList());

        csv.setRows(rows);
        return csv;
    }

    private List<String> generateRow(int rowIndex) {
        return csv.getHeaders().stream()
                .map(columnMap::get)
                .map(Supplier::get)
                .collect(Collectors.toList());
    }
}
