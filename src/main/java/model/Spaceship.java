package model;

import java.util.ArrayList;

/**
 * Класс для описания звездолётов со свойствами <b>name</b>, <b>model</b>, <b>manufacturer</b>,
 * <b>cost_in_credits</b>, <b>length</b>, <b>max_atmosphering_speed</b>, <b>crew</b>,
 * <b>passengers</b>, <b>cargo_capacity</b>, <b>consumables</b>,
 * <b>hyperdrive_rating</b>, <b>MGLT</b>, <b>starship_class</b>,
 * <b>pilots</b>, <b>films</b>, <b>created</b>, <b>edited</b> и <b>url</b>.
 * @author Набиев Азамат Ильдусович
 * @version 1.1
 */
public class Spaceship {
    /** Поле наименования звездолёта */
    private String name;

    /** Поле модели звездолёта */
    private String model;

    /** Поле производителя звездолёта */
    private String manufacturer;

    /** Поле стоимости в кредитах звездолёта */
    private String cost_in_credits;

    /** Поле протяжённость звездолёта */
    private String length;

    /** Поле максимальной скорости звездолёта */
    private String max_atmosphering_speed;

    /** Поле количества членов экипажа звездолёта */
    private String crew;

    /** Поле количества пассажиров звездолёта */
    private String passengers;

    /** Поле грузоподъемности звездолёта */
    private String cargo_capacity;

    /** Поле периода расхода топлива при полном баке звездолёта */
    private String consumables;

    /** Поле рейтинга гипердвигателя звездолёта */
    private String hyperdrive_rating;

    /** Поле расстояния преодалеваемое звездолётом в час, мегасвет */
    private String MGLT;

    /** Поле класса звездолёта */
    private String starship_class;

    /** Поле массива пилотов звездолёта */
    private ArrayList<String> pilots;

    /** Поле массива фильмы, где появлялся звездолёт */
    private ArrayList<String> films;

    /** Поле даты создания записи о звездолёте */
    private String created;

    /** Поле даты последнего редактирования записи о звездолёте */
    private String edited;

    /** Поле ссылки на запись о звездолёте */
    private String url;

    /**
     * Конструктор - создание нового звездалёта с определенными значениями
     * @param name  наименование звездолёта
     * @param model модель звездолёта
     * @param manufacturer производитель звездолёта
     * @param cost_in_credits стоимость в кредитах звездолёта
     * @param length протяжённость звездолёта
     * @param max_atmosphering_speed максимальная скорость звездолёта
     * @param crew количества членов экипажа звездолёта
     * @param passengers количество пассажиров звездолёта
     * @param cargo_capacity грузоподъемность звездолёта
     * @param consumables период расхода топлива при полном баке звездолёта
     * @param hyperdrive_rating рейтинг гипердвигателя звездолёта
     * @param MGLT расстояние преодалеваемое звездолётом в час, мегасвет
     * @param starship_class класс звездолёта
     * @param pilots пилоты звездолёта
     * @param films фильмы, где появлялся звездолёт
     * @param created дата создания записи о звездолёте
     * @param edited дата последнего редактирования записи о звездолёте
     * @param url ссылка на запись о звездолёте
     * @see Spaceship#Spaceship(String, String, String, String,
     * String, String, String, String, String, String, String,
     * String, String, ArrayList, ArrayList, String, String, String)
     */
    public Spaceship(String name, String model, String manufacturer,
                     String cost_in_credits, String length,
                     String max_atmosphering_speed, String crew,
                     String passengers, String cargo_capacity,
                     String consumables, String hyperdrive_rating,
                     String MGLT, String starship_class,
                     ArrayList<String> pilots,
                     ArrayList<String> films,
                     String created, String edited,
                     String url) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.cost_in_credits = cost_in_credits;
        this.length = length;
        this.max_atmosphering_speed = max_atmosphering_speed;
        this.crew = crew;
        this.passengers = passengers;
        this.cargo_capacity = cargo_capacity;
        this.consumables = consumables;
        this.hyperdrive_rating = hyperdrive_rating;
        this.MGLT = MGLT;
        this.starship_class = starship_class;
        this.pilots = pilots;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }
}
