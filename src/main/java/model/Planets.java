package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Planets {
    private List<Planet> results = new ArrayList<>();
    public static List<Planet> planetsArr = new ArrayList<>();

    public void setPlanets(Planet planet) {
        this.results.add(planet);
    }

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

    public void showPlanetsArr()
    {
        for(int i = 0; i < Planets.planetsArr.size(); i++) {
         System.out.println(Planets.planetsArr.get(i));
        }
    }

    public void addPlanet(Planet planet) {
        this.results.add(planet);
    }
}
