package model;

import java.util.ArrayList;

public class Spaceships {
    private ArrayList<Spaceship> spaceships = new ArrayList<>();

    public ArrayList<Spaceship> getSpaceships() {
        return spaceships;
    }

    public void addSpaceships(Spaceship spaceship) {
        this.spaceships.add(spaceship);
    }
}
