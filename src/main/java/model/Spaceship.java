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

    public Spaceship() {
        name = "";
        model = "";
        manufacturer = "";
        cost_in_credits = "";
        length = "";
        max_atmosphering_speed = "";
        crew = "";
        passengers = "";
        cargo_capacity = "";
        consumables = "";
        hyperdrive_rating = "";
        MGLT = "";
        starship_class = "";
        pilots = null;
        films = null;
        created = "";
        edited = "";
        url = "";
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCost_in_credits() {
        return cost_in_credits;
    }

    public String getLength() {
        return length;
    }

    public String getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public String getCrew() {
        return crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public String getCargo_capacity() {
        return cargo_capacity;
    }

    public String getConsumables() {
        return consumables;
    }

    public String getHyperdrive_rating() {
        return hyperdrive_rating;
    }

    public String getMGLT() {
        return MGLT;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public String getPilots(Integer index) {
        return pilots.get(index);
    }

    public Integer getPilotsSize() {
        return this.pilots.size();
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

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCost_in_credits(String cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setMax_atmosphering_speed(String max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public void setCargo_capacity(String cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public void setHyperdrive_rating(String hyperdrive_rating) {
        this.hyperdrive_rating = hyperdrive_rating;
    }

    public void setMGLT(String MGLT) {
        this.MGLT = MGLT;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }

    public void addPilot(String pilot) {
        this.pilots.add(pilot);
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
        return "\n \n Информация о звездолёте:" +
                "\n ========================================================================================" +
                "\n наименование звездолёта: " + name +
                "\n модель звездолёта: " + model +
                "\n производитель звездолёта: " + manufacturer +
                "\n стоимость в кредитах звездолёта: " + cost_in_credits +
                "\n протяжённость звездолёта: " + length +
                "\n максимальная скорость звездолёта: " + max_atmosphering_speed +
                "\n количества членов экипажа звездолёта: " + crew +
                "\n количество пассажиров звездолёта: " + passengers +
                "\n грузоподъемность звездолёта: " + cargo_capacity +
                "\n период расхода топлива при полном баке звездолёта: " + consumables +
                "\n рейтинг гипердвигателя звездолёта: "  + hyperdrive_rating +
                "\n расстояние преодалеваемое звездолётом в час, мегасвет: "  + MGLT +
                "\n класс звездолёта: "  + starship_class +
                "\n пилоты звездолёта: "  + pilots +
                "\n фильмы, где появлялся звездолёт: "  + films +
                "\n дата создания записи о звездолёте: "+ created +
                "\n дата последнего редактирования записи о звездолёте: " + edited +
                "\n ссылка на запись о звездолёте: " + url +
                "\n ========================================================================================";
    }
}
