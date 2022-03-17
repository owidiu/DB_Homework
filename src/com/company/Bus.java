package com.company;

public class Bus extends Vehicle {

    private final int noPassengers;
    private final float ticketPrice;

    public Bus(String colour, int noPassengers, float ticketPrice, boolean functional) {
        super(colour, functional);

        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }


    @Override
    float profit() {
        return charge() * noPassengers * 0.25f;
    }

    @Override
    void display() {
        System.out.println(this);
    }

    @Override
    float charge() {
        return ticketPrice;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "noPassengers=" + noPassengers +
                ", ticketPrice=" + ticketPrice + " " +
                super.getColour() + " " + super.isFunctional() +
                '}';
    }

    public int getNoPassengers() {
        return noPassengers;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }


}
