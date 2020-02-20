package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Planets extends ArrayOfData {
    private List<Planet> results = new ArrayList<>();

    public List<Planet> getPlanet()
    {
        return new LinkedList<>(results);
    }

    public void showPlanets()
    {
        for(int i = 0; i < results.size(); i++) {
         System.out.println(results.get(i));
        }
    }

    public void addPlanet(Planet planet) {
        this.results.add(planet);
    }
}
