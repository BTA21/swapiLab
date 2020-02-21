package model;

import client.ClientInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Species extends ArrayOfData implements ClientInterface {
    public Species() {}

    public Species(Species species){
        species.showAll();
    }

    private List<OneSpecies> results = new ArrayList<>();

    public Species(Species species, String name) {
        species.getByName(name);
    }
    public Species(Species species, Integer index) {
        species.getByIndex(index);
    }

    public List<OneSpecies> getOneSpecies()
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
            System.out.println("\nТакого вида нет!\n");
        }
    }

    @Override
    public void getByIndex(Integer index) {
        if (index > results.size()) {
            System.out.println("\nВида с таким индексом нет!\n");
        }
        System.out.println(results.get(index));
    }

    public void addOneSpecies(OneSpecies oneSpecies) {
        this.results.add(oneSpecies);
    }
}
