package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Species extends ArrayOfData {
    private List<OneSpecies> results = new ArrayList<>();

    public List<OneSpecies> getOneSpecies()
    {
        return new LinkedList<>(results);
    }

    public void showSpecies()
    {
        for(int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));
        }
    }

    public void addOneSpecies(OneSpecies oneSpecies) {
        this.results.add(oneSpecies);
    }
}
