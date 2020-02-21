package model;

import client.ClientInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Planets extends ArrayOfData implements ClientInterface {
    public Planets() {}

    public Planets(Planets planets){
        planets.showAll();
    }

    private List<Planet> results = new ArrayList<>();

    public Planets(Planets planets, String name) {
        planets.getByName(name);
    }
    public Planets(Planets planets, Integer index) {
        planets.getByIndex(index);
    }

    public List<Planet> getPlanet()
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
            System.out.println("\nТакой планеты нет!\n");
        }
    }

    @Override
    public void getByIndex(Integer index) {
        if (index > results.size()) {
            System.out.println("\nПланеты с таким индексом нет!\n");
        }
        System.out.println(results.get(index));
    }

    public void addPlanet(Planet planet) {
        this.results.add(planet);
    }
}
