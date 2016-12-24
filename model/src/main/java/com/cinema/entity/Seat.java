package com.cinema.entity;

/**
 * Created by taras on 24.12.16.
 */
public class Seat {
    private int id;
    private AvailabilityType availabilityType = AvailabilityType.AVAILABLE;
    private int price;

    public Seat(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public Seat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public AvailabilityType getAvailabilityType() {
        return availabilityType;
    }

    public void setAvailabilityType(AvailabilityType availabilityType) {
        this.availabilityType = availabilityType;
    }

}
