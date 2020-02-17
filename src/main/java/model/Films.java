package model;

import java.util.ArrayList;

public class Films {
    private ArrayList<Film> films;

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void addFilms(Film film) {
        this.films.add(film);
    }
}
