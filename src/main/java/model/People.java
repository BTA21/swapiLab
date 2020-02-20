package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class People extends ArrayOfData {
    private List<Person> results = new ArrayList<>();

    public List<Person> getPerson()
    {
        return new LinkedList<>(results);
    }

    public People showPeople()
    {
        for(int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));
        }
        return null;
    }

    public void addPerson(Person person) {
        this.results.add(person);
    }
}

