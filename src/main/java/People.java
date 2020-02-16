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
public class People {
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
     * @see People#People(String, String, String,
     * String, String, String, String, String,
     * String, ArrayList, ArrayList,
     * ArrayList, ArrayList, String,
     * String, String)
     */
    public People(String name, String height, String mass,
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
}
