package com.company;

public abstract class Vehicle implements Comparable<Vehicle> {
    private String colour;
    private boolean functional;

    public Vehicle(String colour, boolean functional) {
        this.colour = colour;
        this.functional = functional;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "colour='" + colour + '\'' +
                ", functional=" + functional +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFunctional() {
        return functional;
    }

    public void setFunctional(boolean functional) {
        this.functional = functional;
    }

    abstract float charge();

    abstract float profit();

    abstract void display();

    public int compareTo(Vehicle o) {
        return (int) (profit() - o.profit());
    }

}
