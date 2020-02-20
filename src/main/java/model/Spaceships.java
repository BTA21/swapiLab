package model;

import client.ClientInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Spaceships extends ArrayOfData implements ClientInterface {

    private List<Spaceship> results = new ArrayList<>();

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
