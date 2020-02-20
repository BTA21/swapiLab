package model;

import java.util.ArrayList;

/**
 * Класс для описания транспортных средств со свойствами <b>name</b>, <b>model</b>, <b>manufacturer</b>,
 * <b>cost_in_credits</b>, <b>length</b>, <b>max_atmosphering_speed</b>, <b>crew</b>,
 * <b>passengers</b>, <b>cargo_capacity</b>, <b>consumables</b>,
 * <b>vehicle_class</b>, <b>pilots</b>, <b>films</b>,
 * <b>created</b>, <b>edited</b> и <b>url</b>.
 * @author Набиев Азамат Ильдусович
 * @version 1.1
 */
public class Vehicle {
    /** Поле наименования транспортного средства */
    private String name;

    /** Поле модели транспортного средства */
    private String model;

    /** Поле производителя транспортного средства */
    private String manufacturer;

    /** Поле стоимости в кредитах транспортного средства */
    private String cost_in_credits;

    /** Поле длины транспортного средства */
    private String length;

    /** Поле максимальной скорости транспортного средства */
    private String max_atmosphering_speed;

    /** Поле количества членов экипажа транспортного средства */
    private String crew;

    /** Поле количества пассажиров транспортного средства */
    private String passengers;

    /** Поле грузоподъемности транспортного средства */
    private String cargo_capacity;

    /** Поле периода расхода топлива при полном баке транспортного средства */
    private String consumables;

    /** Поле класса транспортного средства */
    private String vehicle_class;

    /** Поле массива пилотов транспортного средства */
    private ArrayList<String> pilots;

    /** Поле массива фильмы, где появлялось транспортное средство */
    private ArrayList<String> films;

    /** Поле даты создания записи о транспортном средстве */
    private String created;

    /** Поле даты последнего редактирования записи о транспортном средстве */
    private String edited;

    /** Поле ссылки на запись о транспортном средстве */
    private String url;

    /**
     * Конструктор - создание нового транспортного средства с определенными значениями
     * @param name  наименование транспортного средства
     * @param model модель транспортного средства
     * @param manufacturer производитель транспортного средства
     * @param cost_in_credits стоимость в кредитах транспортного средства
     * @param length протяжённость транспортного средства
     * @param max_atmosphering_speed максимальная скорость транспортного средства
     * @param crew количества членов экипажа транспортного средства
     * @param passengers количество пассажиров транспортного средства
     * @param cargo_capacity грузоподъемность транспортного средства
     * @param consumables период расхода топлива при полном баке транспортного средства
     * @param vehicle_class класс транспортного средства
     * @param pilots пилоты транспортного средства
     * @param films фильмы, где появлялось транспортное средство
     * @param created дата создания записи о транспортном средстве
     * @param edited дата последнего редактирования записи о транспортном средстве
     * @param url ссылка на запись о транспортном средстве
     * @see Vehicle#Vehicle(String, String, String, String,
     * String, String, String, String, String, String, String,
     * ArrayList, ArrayList, String, String, String)
     */
    public Vehicle(String name, String model, String manufacturer,
                   String cost_in_credits, String length,
                   String max_atmosphering_speed, String crew,
                   String passengers, String cargo_capacity,
                   String consumables, String vehicle_class,
                   ArrayList<String> pilots, ArrayList<String> films,
                   String created, String edited, String url) {
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
        this.vehicle_class = vehicle_class;
        this.pilots = pilots;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public Vehicle() {
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
        vehicle_class = "";
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

    public String getVehicle_class() {
        return vehicle_class;
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

    public void setVehicle_class(String vehicle_class) {
        this.vehicle_class = vehicle_class;
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
        return "\n \n Информация о транспортном средстве:" +
                "\n ========================================================================================" +
                "\n наименование транспортного средства: " + name +
                "\n модель транспортного средства: " + model +
                "\n производитель транспортного средства: " + manufacturer +
                "\n стоимость в кредитах транспортного средства: " + cost_in_credits +
                "\n протяжённость транспортного средства: " + length +
                "\n максимальная скорость транспортного средства: " + max_atmosphering_speed +
                "\n количества членов экипажа транспортного средства: " + crew +
                "\n количество пассажиров транспортного средства: " + passengers +
                "\n грузоподъемность транспортного средства: " + cargo_capacity +
                "\n период расхода топлива при полном баке транспортного средства: " + consumables +
                "\n класс транспортного средства: "  + vehicle_class +
                "\n пилоты транспортного средства: "  + pilots +
                "\n фильмы, где появлялось транспортное средство"  + films +
                "\n дата создания записи о транспортном средстве: "+ created +
                "\n дата последнего редактирования записи о транспортном средстве: " + edited +
                "\n ссылка на запись о транспортном средстве: " + url +
                "\n ========================================================================================";
    }
}
