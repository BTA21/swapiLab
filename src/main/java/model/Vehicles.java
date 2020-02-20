package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Vehicles extends ArrayOfData {
    private List<Vehicle> results = new ArrayList<>();

    public List<Vehicle> getVehicle()
    {
        return new LinkedList<>(results);
    }

    public void showVehicles()
    {
        for(int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));
        }
    }

    public void addVehicle(Vehicle vehicle) {
        this.results.add(vehicle);
    }
}
