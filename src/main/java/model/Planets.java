package model;

import java.util.LinkedList;
import java.util.List;

public class Planets {
    List<Planet> results = new LinkedList<>();

    public List<Planet> getPlanet()
    {
        return new LinkedList<>(results);
    }

    public void addPlanet(Planet planet) {
        this.results.add(planet);
    }
}
