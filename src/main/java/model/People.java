package model;

import client.ClientInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class People extends ArrayOfData implements ClientInterface {
    private List<Person> results = new ArrayList<>();

    public People() {}

    public People(People people, Integer index) {
        people.getByIndex(index);
    }

    public People(People people, String name) {
        people.getByName(name);
    }

    public People(People people) {
        people.showAll();
    }

    public List<Person> getPerson()
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
            System.out.println("\nТакого Персонажа нет!\n");
        }
    }

    @Override
    public void getByIndex(Integer index) {
        if (index > results.size()) {
            System.out.println("\nПерсонажа с таким индексом нет!\n");
        }
        System.out.println(results.get(index));
    }

    public void addPerson(Person person) {
        this.results.add(person);
    }
}

