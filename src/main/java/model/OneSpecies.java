package model;

import java.util.ArrayList;

/**
 * Класс для описания видов со свойствами <b>name</b>, <b>classification</b>,
 * <b>designation</b>, <b>average_height</b>, <b>hair_color</b>,
 * <b>skin_color</b>, <b>eye_color</b>, <b>average_lifespan</b>,
 *  <b>homeworld</b>, <b>language</b>, <b>people</b>,
 * <b>films</b>, <b>created</b>, <b>edited</b> и <b>url</b>.
 * @author Набиев Азамат Ильдусович
 * @version 1.1
 */
public class OneSpecies {
    /** Поле наименования вида */
    private  String name;

    /** Поле классификации вида */
    private String classification;

    /** Поле наличия интеллекта у представителя вида */
    private String designation;

    /** Поле средний рост представителя вида */
    private String average_height;


    /** Поле цвета волос представителя вида */
    private String hair_color;

    /** Поле цвета эпидермиса представителя вида */
    private String skin_color;

    /** Поле цвета глаз представителя вида */
    private String eye_color;

    /** Поле средней продолжительности жизни представителя вида */
    private String average_lifespan;

    /** Поле родной планеты данного вида*/
    private String homeworld;

    /** Поле язык, на котором общаются представители вида*/
    private String language;

    /** Поле массива персонажи, которые принадлежат к данному виду */
    private ArrayList<String> people;

    /** Поле массива фильмы, где появлялись представители данного вида */
    private ArrayList<String> films;

    /** Поле даты создания записи о виде */
    private String created;

    /** Поле даты последнего редактирования записи о виде */
    private String edited;

    /** Поле ссылки на запись о виде */
    private String url;

    /**
     * Конструктор - создание нового вида с определенными значениями
     * @param name  наименование вида
     * @param classification классификация вида
     * @param designation наличие интеллекта у представителя вида
     * @param average_height средний рост представителя вида
     * @param hair_color цвет волос представителя вида
     * @param skin_color цвет эпидермиса представителя вида
     * @param eye_color цвет глаз представителя вида
     * @param average_lifespan средняя продолжительность жизни представителя вида
     * @param homeworld родная планета данного вида
     * @param language язык, на котором общаются представители вида
     * @param people персонажи, которые принадлежат к данному виду
     * @param films фильмы, где появлялся данный вид
     * @param created дата создания записи о виде
     * @param edited дата последнего редактирования записи о виде
     * @param url ссылка на запись о виде
     * @see OneSpecies#OneSpecies(String, String, String, String,
     * String, String, String, String, String, String,
     * ArrayList, ArrayList, String, String, String)
     */
    public OneSpecies(String name, String classification,
                      String designation, String average_height,
                      String hair_color, String skin_color, String eye_color,
                      String average_lifespan, String homeworld,
                      String language, ArrayList<String> people,
                      ArrayList<String> films, String created,
                      String edited, String url) {
        this.name = name;
        this.classification = classification;
        this.designation = designation;
        this.average_height = average_height;
        this.hair_color = hair_color;
        this.skin_color = skin_color;
        this.eye_color = eye_color;
        this.average_lifespan = average_lifespan;
        this.homeworld = homeworld;
        this.language = language;
        this.people = people;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public OneSpecies() {
        name = "";
        classification = "";
        designation = "";
        average_height = "";
        hair_color = "";
        skin_color = "";
        eye_color = "";
        average_lifespan = "";
        homeworld = "";
        language = "";
        people = null;
        films = null;
        created = "";
        edited = "";
        url = "";
    }

    public String getName() {
        return name;
    }

    public String getClassification() {
        return classification;
    }

    public String getDesignation() {
        return designation;
    }

    public String getAverage_height() {
        return average_height;
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

    public String getAverage_lifespan() {
        return average_lifespan;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public String getLanguage() {
        return language;
    }

    public String getPeople(Integer index) {
        return people.get(index);
    }

    public Integer getPeopleSize() {
        return this.people.size();
    }

    public String getFilms(Integer index) {
        return films.get(index);
    }

    public Integer getFilmsSize() {
        return this.films.size();
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

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setAverage_height(String average_height) {
        this.average_height = average_height;
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

    public void setAverage_lifespan(String average_lifespan) {
        this.average_lifespan = average_lifespan;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void addPerson(String person) {
        this.people.add(person);
    }

    public void addFilm(String film) {
        this.films.add(film);
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
        return "\n \n Информация о виде:" +
                "\n ========================================================================================" +
                "\n наименование вида: " + name +
                "\n классификация вида: " + classification +
                "\n наличие интеллекта у представителя вида: " + designation +
                "\n средний рост представителя вида: " + average_height +
                "\n цвет волос представителя вида: " + hair_color +
                "\n цвет эпидермиса представителя вида: " + skin_color +
                "\n цвет глаз представителя вида: " + eye_color +
                "\n средняя продолжительность жизни представителя вида: " + average_lifespan +
                "\n родная планета данного вида: " + homeworld +
                "\n язык, на котором общаются представители вида: " + language +
                "\n персонажи, которые принадлежат к данному виду: "  + people +
                "\n фильмы, где появлялся данный вид: "  + films +
                "\n дата создания записи о виде: "+ created +
                "\n дата последнего редактирования записи о виде: " + edited +
                "\n ссылка на запись о виде: " + url +
                "\n ========================================================================================";
    }
}
