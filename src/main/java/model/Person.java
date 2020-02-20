package model;

import java.util.ArrayList;

/**
 * Класс для описания персонажей со свойствами <b>name</b>, <b>height</b>, <b>mass</b>,
 * <b>hair_color</b>, <b>skin_color</b>, <b>eye_color</b>, <b>birth_year</b>,
 * <b>gender</b>, <b>homeworld</b>, <b>films</b>,
 * <b>species</b>, <b>vehicles</b>, <b>starships</b>,
 * <b>created</b>, <b>edited</b> и <b>url</b>.
 * @author Набиев Азамат Ильдусович
 * @version 1.1
 */
public class Person {
    /** Поле наименования персонажа */
    private  String name;

    /** Поле роста персонажа */
    private String height;

    /** Поле веса персонажа */
    private String mass;

    /** Поле цвета волос персонажа */
    private String hair_color;

    /** Поле цвета эпидермиса персонажа */
    private String skin_color;

    /** Поле цвета глаз персонажа */
    private String eye_color;

    /** Поле года рождения персонажа */
    private String birth_year;

    /** Поле пола персонажа */
    private String gender;

    /** Поле родной планеты персонажа */
    private String homeworld;

    /** Поле массива фильмы, где появлялся персонаж */
    private ArrayList<String> films;

    /** Поле массива вид, к которому принадлежит персонаж */
    private ArrayList<String> species;

    /** Поле массива транспортные средства, на которых бывал персонаж */
    private ArrayList<String> vehicles;

    /** Поле массива звездолёты, на которых бывал персонаж */
    private ArrayList<String> starships;

    /** Поле даты создания записи о персонаже */
    private String created;

    /** Поле даты последнего редактирования записи о персонаже */
    private String edited;

    /** Поле ссылки на запись о персонаже */
    private String url;

    /**
     * Конструктор - создание нового персонажа с определенными значениями
     * @param name  наименование персонажа
     * @param height рост персонажа
     * @param mass вес персонажа
     * @param hair_color цвет волос персонажа
     * @param skin_color цвет эпидермиса персонажа
     * @param eye_color цвет глаз персонажа
     * @param birth_year год рождения персонажа
     * @param gender пол персонажа
     * @param homeworld родная планета персонажа
     * @param films фильмы, где появлялся персонаж
     * @param species вид, к которому принадлежит персонаж
     * @param vehicles транспортные средства, на которых бывал персонаж
     * @param starships звездолёты, на которых бывал персонаж
     * @param created дата создания записи о персонаже
     * @param edited дата последнего редактирования записи о персонаже
     * @param url ссылка на запись о персонаже
     * @see Person#Person(String, String, String,
     * String, String, String, String, String,
     * String, ArrayList, ArrayList,
     * ArrayList, ArrayList, String,
     * String, String)
     */
    public Person(String name, String height, String mass,
                  String hair_color, String skin_color,
                  String eye_color, String birth_year,
                  String gender, String homeworld,
                  ArrayList<String> films,
                  ArrayList<String> species,
                  ArrayList<String> vehicles,
                  ArrayList<String> starships,
                  String created, String edited,
                  String url) {
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hair_color = hair_color;
        this.skin_color = skin_color;
        this.eye_color = eye_color;
        this.birth_year = birth_year;
        this.gender = gender;
        this.homeworld = homeworld;
        this.films = films;
        this.species = species;
        this.vehicles = vehicles;
        this.starships = starships;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public Person() {
        name = "";
        height = "";
        mass = "";
        hair_color = "";
        skin_color = "";
        eye_color = "";
        birth_year = "";
        gender = "";
        homeworld = "";
        films = null;
        species = null;
        vehicles = null;
        starships = null;
        created = "";
        edited = "";
        url = "";
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public String getMass() {
        return mass;
    }

    public String getHair_color() {
        return hair_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public String getGender() {
        return gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public String getFilms(Integer index) {
        return films.get(index);
    }

    public Integer getFilmsSize() {
        return this.films.size();
    }

    public String getSpecies(Integer index) {
        return species.get(index);
    }

    public Integer getSpeciesSize() {
        return this.species.size();
    }

    public String getVehicles(Integer index) {
        return vehicles.get(index);
    }

    public Integer getVehiclesSize() {
        return this.vehicles.size();
    }

    public String getStarships(Integer index) {
        return starships.get(index);
    }

    public Integer getStarshipsSize() {
        return this.starships.size();
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

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public void addFilm(String film) {
        this.films.add(film);
    }

    public void addOneSpecies(String oneSpecies) {
        this.species.add(oneSpecies);
    }

    public void addVehicle(String vehicle) {
        this.vehicles.add(vehicle);
    }

    public void addStarship(String starship) {
        this.starships.add(starship);
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
        return "\n \n Информация о персонаже:" +
                "\n ========================================================================================" +
                "\n наименование персонажа: " + name +
                "\n рост персонажа: " + height +
                "\n вес персонажа: " + mass +
                "\n цвет волос персонажа: " + hair_color +
                "\n цвет эпидермиса персонажа: " + skin_color +
                "\n цвет глаз персонажа: " + eye_color +
                "\n год рождения персонажа: " + birth_year +
                "\n пол персонажа: " + gender +
                "\n родная планета персонажа: " + homeworld +
                "\n фильмы, где появлялся персонаж: "  + films +
                "\n вид, к которому принадлежит персонаж: " + species +
                "\n транспортные средства, на которых бывал персонаж: "  + vehicles +
                "\n звездолёты, на которых бывал персонаж: "  + starships +
                "\n дата создания записи о персонаже: "+ created +
                "\n дата последнего редактирования записи о персонаже: " + edited +
                "\n ссылка на запись о персонаже: " + url +
                "\n ========================================================================================";
    }
}
