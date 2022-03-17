package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle v1 = new Bus("green", 5, 3.6f, true);
        Vehicle v2 = new Bus("green", 6, 4.5f, true);
        Vehicle v3 = new Bus("green", 9, 5.8f, true);
        Vehicle v4 = new Taxi("green", 3, 32.8f, false);
        Vehicle v5 = new Bus("green", 5, 32.4f, true);
        Vehicle v6 = new Taxi("purple", 1, 50.8f, false);
        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);
        vehicles.add(v4);
        vehicles.add(v5);
        vehicles.add(v6);

        BusStation bs = new BusStation(vehicles);

        System.out.println("List of Vehicles:");
        bs.showAllVehicles();

        System.out.println("Total Profit: ");
        bs.showTotalProfit();

        System.out.println("Sorted by profit: ");
        bs.sortVehicles();
        bs.showAllVehicles();

    }
}
