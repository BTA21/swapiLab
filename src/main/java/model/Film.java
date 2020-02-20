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
     * @param opening_crawl открывающий текст-вступление фильма
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

    public String getTitle() {
        return title;
    }

    public String getEpisode_id() {
        return episode_id;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getCharacters(Integer index) {
        return characters.get(index);
    }

    public Integer getCharactersSize() {
        return this.characters.size();
    }

    public String getPlanets(Integer index) {
        return planets.get(index);
    }

    public Integer getPlanetsSize() {
        return this.planets.size();
    }

    public String getStarships(Integer index) {
        return starships.get(index);
    }

    public Integer getStarshipsSize() {
        return this.starships.size();
    }

    public String getVehicles(Integer index) {
        return vehicles.get(index);
    }

    public Integer getVehiclesSize() {
        return this.vehicles.size();
    }

    public String getSpecies(Integer index) {
        return species.get(index);
    }

    public Integer getSpeciesSize() {
        return this.species.size();
    }

    public String getCreated() {
        return created;
    }

    public String getEdited() {
        return edited;
    }

    public String getUrl() {
        return url;
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

    public void addCharacter(String character) {
        this.characters.add(character);
    }

    public void addPlanet(String planet) {
        this.planets.add(planet);
    }

    public void addStarship(String starship) {
        this.starships.add(starship);
    }

    public void addVehicle(String vehicle) {
        this.vehicles.add(vehicle);
    }

    public void addSpecies(String oneSpecies) {
        this.species.add(oneSpecies);
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

    public String toString(){
        return "\n \n Информация о фильме:" +
                "\n ========================================================================================" +
                "\n наименование фильма: " + title +
                "\n порядковый номер фильма: " + episode_id +
                "\n открывающий текст-вступление фильма: \n" + opening_crawl +
                "\n имя режиссёра фильма: " + director +
                "\n имя продюсера фильма: " + producer +
                "\n дата премьеры фильма: " + release_date +
                "\n персонажи, которые появляются в фильме: " + characters +
                "\n планеты, которые появляются в фильме: " + planets +
                "\n звездолёты, которые появляются в фильме: " + starships +
                "\n транспортные средства, которые появляются в фильме: " + vehicles +
                "\n виды, которые появляются в фильме: "  + species +
                "\n дата создания записи о фильме: "+ created +
                "\n дата последнего редактирования записи о фильме: " + edited +
                "\n ссылка на запись о фильме: " + url +
                "\n ========================================================================================";
    }
}

