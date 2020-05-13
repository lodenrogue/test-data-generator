package com.arkvis.tdg.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Csv {
    private List<String> headers;
    private List<List<String>> rows;

    public Csv() {
        headers = new ArrayList<>();
        rows = new ArrayList<>();
    }

    public void addColumn(String columnName) {
        headers.add(columnName);
    }

    void setRows(List<List<String>> rows) {
        this.rows = new ArrayList<>(rows);
    }

    public List<String> getHeaders() {
        return headers;
    }

    public List<List<String>> getRows() {
        return rows;
    }

    @Override
    public String toString() {
        String rowFormat = createRowFormat();

        StringBuilder sb = new StringBuilder();
        sb.append(String.format(rowFormat, headers.toArray()));
        rows.forEach(row -> sb.append(String.format(rowFormat, row.toArray())));

        return sb.toString();
    }

    private String createRowFormat() {
        return headers.stream()
                .map(h -> "%s")
                .collect(Collectors.joining(",", "", "\n"));
    }
}
