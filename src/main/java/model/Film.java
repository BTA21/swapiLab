package model;

import java.util.ArrayList;

/**
 * Класс для описания фильмов со свойствами <b>name</b>, <b>classification</b>,
 * <b>designation</b>, <b>average_height</b>, <b>hair_color</b>,
 * <b>skin_color</b>, <b>eye_color</b>, <b>average_lifespan</b>,
 *  <b>homeworld</b>, <b>language</b>, <b>people</b>,
 * <b>films</b>, <b>created</b>, <b>edited</b> и <b>url</b>.
 * @author Набиев Азамат Ильдусович
 * @version 1.1
 */
public class Film {
    /** Поле наименования фильма */
    private String title;

    /** Поле порядкового номера фильма */
    private String episode_id;

    /** Поле открывающего текста-вступления фильма */
    private String opening_crawl;

    /** Поле имени режиссёра фильма */
    private String director;

    /** Поле имени продюсера фильма */
    private String producer;

    /** Поле даты премьеры фильма */
    private String release_date;

    /** Поле массива персонажи, которые появляются в фильме */
    private ArrayList<String> characters;

    /** Поле массива планеты, которые появляются в фильме */
    private ArrayList<String> planets;

    /** Поле массива звездолёты, которые появляются в фильме */
    private ArrayList<String> starships;

    /** Поле массива транспортные средства, которые появляются в фильме */
    private ArrayList<String> vehicles;

    /** Поле массива виды, которые появляются в фильме */
    private ArrayList<String> species;

    /** Поле даты создания записи о фильме */
    private String created;

    /** Поле даты последнего редактирования записи о фильме */
    private String edited;

    /** Поле ссылки на запись о фильме */
    private String url;

    /**
     * Конструктор - создание нового фильма с определенными значениями
     * @param title  наименование фильма
     * @param episode_id порядковый номера фильма
     * @param opening_crawl открывающий текст-вступления фильма
     * @param director имя режиссёра фильма
     * @param producer имя продюсера фильма
     * @param release_date дата премьеры фильма
     * @param characters персонажи, которые появляются в фильме
     * @param planets планеты, которые появляются в фильме
     * @param starships звездолёты, которые появляются в фильме
     * @param vehicles транспортные средства, которые появляются в фильме
     * @param species виды, которые появляются в фильме
     * @param created дата создания записи о фильме
     * @param edited дата последнего редактирования записи о фильме
     * @param url ссылка на запись о фильме
     * @see Film#Film(String, String, String, String,
     * String, String, ArrayList, ArrayList, ArrayList,
     * ArrayList, ArrayList, String, String, String)
     */
    public Film(String title, String episode_id, String opening_crawl,
                String director, String producer, String release_date,
                ArrayList<String> characters, ArrayList<String> planets,
                ArrayList<String> starships, ArrayList<String> vehicles,
                ArrayList<String> species, String created, String edited,
                String url) {
        this.title = title;
        this.episode_id = episode_id;
        this.opening_crawl = opening_crawl;
        this.director = director;
        this.producer = producer;
        this.release_date = release_date;
        this.characters = characters;
        this.planets = planets;
        this.starships = starships;
        this.vehicles = vehicles;
        this.species = species;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public Film() {
        title = "";
        episode_id = "";
        opening_crawl = "";
        director = "";
        producer = "";
        release_date = "";
        characters = null;
        planets = null;
        starships = null;
        vehicles = null;
        species = null;
        created = null;
        edited = "";
        url = "";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEpisode_id(String episode_id) {
        this.episode_id = episode_id;
    }

    public void setOpening_crawl(String opening_crawl) {
        this.opening_crawl = opening_crawl;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public void setCharacters(ArrayList<String> characters) {
        this.characters = characters;
    }

    public void setPlanets(ArrayList<String> planets) {
        this.planets = planets;
    }

    public void setStarships(ArrayList<String> starships) {
        this.starships = starships;
    }

    public void setVehicles(ArrayList<String> vehicles) {
        this.vehicles = vehicles;
    }

    public void setSpecies(ArrayList<String> species) {
        this.species = species;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

