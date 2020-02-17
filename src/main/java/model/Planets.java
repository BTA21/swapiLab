package model;

import java.util.LinkedList;
import java.util.List;

public class Planets {
    List<Planet> planets = new LinkedList<>();

    public List<Planet> getPlanet()
    {
        return new LinkedList<>(planets);
    }

    public void addPlanet(Planet planet) {
        this.planets.add(planet);
    }
}
