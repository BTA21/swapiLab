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
