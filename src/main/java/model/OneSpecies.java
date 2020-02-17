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
}
