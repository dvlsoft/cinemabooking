package com.cinema.entity;

import java.util.ArrayList;

/**
 * Created by taras on 24.12.16.
 */
public class Hall {
    private String name;
    private ArrayList<Row> rows;

    public Hall() {
        rows = new ArrayList<>();
    }

    public Hall(String name) {
        this.name = name;
    }

    public Hall(String name, ArrayList<Row> rows) {
        this.name = name;
        this.rows = rows;
    }

    public int rowCount() {
        return rows.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
