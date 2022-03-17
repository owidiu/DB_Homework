package com.company;

public class Taxi extends Vehicle {

    private int noPassengers;
    private float ticketPrice;

    public Taxi(String colour, int noPassengers,float ticketPrice,boolean functional) {
        super(colour,functional);
        this.noPassengers=noPassengers;
        this.ticketPrice=ticketPrice;
    }


    @Override
    float charge() {
        return ticketPrice;
    }

    @Override
    float profit() {
        return charge()*noPassengers*0.25f;
    }

    @Override
    void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "noPassengers=" + noPassengers +
                ", ticketPrice=" + ticketPrice + " "+
                super.getColour()+ " "+ super.isFunctional()+
                '}';
    }

    public int getNoPassengers() {
        return noPassengers;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setNoPassengers(int noPassengers) {
        this.noPassengers = noPassengers;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }


}
