package model;

import java.util.ArrayList;

public class Vehicles {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicles(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
}
