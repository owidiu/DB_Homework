package com.company;

import java.util.Collections;
import java.util.List;

public class BusStation {
    float profitTot = 0;
    List<Vehicle> busses;

    public BusStation(List<Vehicle> busses) {
        this.busses = busses;
    }

    public void showAllVehicles() {
        for (Vehicle bus : busses) {
            System.out.println(bus);
        }

    }

    public void showTotalProfit() {
        for (Vehicle bus : busses) {
            profitTot = profitTot + bus.profit();
        }
        System.out.println(profitTot);
    }

    public void sortVehicles() {
        Collections.sort(busses);
    }


}