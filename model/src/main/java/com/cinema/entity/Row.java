package com.cinema.entity;

import java.util.ArrayList;

/**
 * Created by taras on 24.12.16.
 */
public class Row {
    private ArrayList<Seat> seats;

    public Row() {
    }

    public Row(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
}