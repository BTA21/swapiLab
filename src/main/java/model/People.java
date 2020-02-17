package model;

import java.util.ArrayList;

public class People {
    private ArrayList<Character> people = new ArrayList<>();

    public ArrayList<Character> getPeople() {
        return people;
    }

    public void addPeople(Character character) {
        this.people.add(character);
    }
}
