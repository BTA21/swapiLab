package model;

import client.ClientInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Spaceships extends ArrayOfData implements ClientInterface {

    public Spaceships(){}

    public Spaceships(Spaceships spaceships){
        spaceships.showAll();
    }
    public List<Spaceship> results = new ArrayList<>();

    public Spaceships(Spaceships spaceships, String name) {
        spaceships.getByName(name);
    }

    public Spaceships(Spaceships spaceships, Integer index) {
        spaceships.getByIndex(index);
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
            System.out.println("\nТакого звездолёта нет!\n");
        }
    }

    @Override
    public void getByIndex(Integer index) {
        if (index > results.size()) {
            System.out.println("\nЗвездолёта с таким индексом нет!\n");
        }
        System.out.println(results.get(index));

    }

    public List<Spaceship> getSpaceship()
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

    public void addSpaceship(Spaceship spaceship) {
        this.results.add(spaceship);
    }
}
