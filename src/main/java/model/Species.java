package model;

import java.util.ArrayList;

public class Species {
    private ArrayList<OneSpecies> species = new ArrayList<>();

    public ArrayList<OneSpecies> getSpecies() {
        return species;
    }

    public void addSpecies(OneSpecies oneSpecies) {
        this.species.add(oneSpecies);
    }
}
