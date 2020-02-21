package model;

import client.ClientInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Vehicles extends ArrayOfData implements ClientInterface {
    private List<Vehicle> results = new ArrayList<>();

    public Vehicles() {}

    public Vehicles(Vehicles vehicles) {
        vehicles.showAll();
    }

    public Vehicles(Vehicles vehicles, String name) {
        vehicles.getByName(name);
    }

    public Vehicles(Vehicles vehicles, Integer index) {
        vehicles.getByIndex(index);
    }

    public List<Vehicle> getVehicle()
    {
        return new LinkedList<>(results);
    }

    @Override
    public void showAll()
    {
        for(int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));
        }
    }

    @Override
    public void getByName(String name) {
        Integer messageCounter = 0;
        for(int i = 0; i < results.size(); i++) {
            if (results.get(i).getName().equals(name)) {
                System.out.println(results.get(i));
                messageCounter = 1;
            }
        }
        if (messageCounter == 0) {
            System.out.println("\nТакого транспортного средства нет!\n");
        }
    }

    @Override
    public void getByIndex(Integer index) {
        if (index > results.size()) {
            System.out.println("\nТранспортного средства с таким индексом нет!\n");
        }
        System.out.println(results.get(index));
    }

    public void addVehicle(Vehicle vehicle) {
        this.results.add(vehicle);
    }
}
