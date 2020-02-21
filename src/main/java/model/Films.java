package model;

import client.ClientInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Films extends ArrayOfData implements ClientInterface {

    public Films(){}

    public Films(Films films){
        films.showAll();
    }
    public List<Film> results = new ArrayList<>();

    public Films(Films films, String title) {
      films.getByName(title);
    }
    public Films(Films films, Integer index) {
      films.getByIndex(index);
    }

    @Override
    public void getByName(String title) {
        Integer messageCounter = 0;
        for(int i = 0; i < results.size(); i++) {
            if (results.get(i).getTitle().equals(title)) {
                System.out.println(results.get(i));
                messageCounter = 1;
            }
        }
        if (messageCounter == 0) {
            System.out.println("\nТакого фильма нет!\n");
        }
    }

    @Override
    public void getByIndex(Integer index) {
        if (index > results.size()) {
            System.out.println("\nФильма с таким индексом нет!\n");
        }
        System.out.println(results.get(index));
    }

    public List<Film> getFilm()
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

    public void addFilm(Film film) {
        this.results.add(film);
    }
}
