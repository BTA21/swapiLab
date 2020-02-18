package model;

import java.util.ArrayList;

/**
 * Класс для описания планет со свойствами <b>name</b>, <b>rotation_period</b>, <b>orbital_period</b>,
 * <b>diameter</b>, <b>climate</b>, <b>gravity</b>, <b>terrain</b>,
 * <b>surface_water</b>, <b>population</b>, <b>residents</b>,
 * <b>films</b>, <b>created</b>, <b>edited</b> и <b>url</b>.
 * @author Набиев Азамат Ильдусович
 * @version 1.1
 */
public class Planet {
    /** Поле наименования планеты */
    private String name;

    /** Поле период вращения планеты */
    private String rotation_period;

    /** Поле орбитальный периода планеты */
    private String orbital_period;

    /** Поле диаметра планеты */
    private String diameter;

    /** Поле климата планеты */
    private String climate;

    /** Поле гравитации планеты */
    private String gravity;

    /** Поле местности планеты */
    private String terrain;

    /** Поле поверхности воды планеты */
    private String surface_water;

    /** Поле популяции планеты */
    private String population;

    /** Поле массива жителей планеты */
    private ArrayList<String> residents;

    /** Поле массива фильмы, где появлялся звездолёт */
    private ArrayList<String> films;

    /** Поле даты создания записи о планете */
    private String created;

    /** Поле даты последнего редактирования записи о планете */
    private String edited;

    /** Поле ссылки на запись о планете */
    private String url;

    /**
     * Конструктор - создание новой планеты с определенными значениями
     * @param name  наименование планеты
     * @param rotation_period период вращения планеты
     * @param orbital_period орбитальный период планеты
     * @param diameter диаметр планеты
     * @param climate климат планеты
     * @param gravity гравитация планеты
     * @param terrain местность планеты
     * @param surface_water поверхность воды планеты
     * @param population популяция планеты
     * @param residents жители планеты
     * @param films фильмы, где появлялась планета
     * @param created дата создания записи о планете
     * @param edited дата последнего редактирования записи о планете
     * @param url ссылка на запись о планете
     * @see Planet#Planet(String, String, String, String,
     * String, String, String, String, String, ArrayList,
     * ArrayList, String, String, String)
     */
    public Planet(String name, String rotation_period,
                  String orbital_period, String diameter,
                  String climate, String gravity,
                  String terrain, String surface_water,
                  String population, ArrayList<String> residents,
                  ArrayList<String> films, String created,
                  String edited, String url) {
        this.name = name;
        this.rotation_period = rotation_period;
        this.orbital_period = orbital_period;
        this.diameter = diameter;
        this.climate = climate;
        this.gravity = gravity;
        this.terrain = terrain;
        this.surface_water = surface_water;
        this.population = population;
        this.residents = residents;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public Planet() {
        name = "";
        rotation_period = "";
        orbital_period = "";
        diameter = "";
        climate = "";
        gravity = "";
        terrain = "";
        surface_water = "";
        population = "";
        residents = new ArrayList<>();
        films = new ArrayList<>();
        created = "";
        edited = "";
        url = "";
    }

    public String getName() {
        return name;
    }

    public String getRotation_period() {
        return rotation_period;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public String getDiameter() {
        return diameter;
    }

    public String getClimate() {
        return climate;
    }

    public String getGravity() {
        return gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public String getSurface_water() {
        return surface_water;
    }

    public String getPopulation() {
        return population;
    }

    public ArrayList<String> getResidentsArray(ArrayList<String> arrayList) {
        return arrayList;
    }

    public String getResidents(Integer index) {
        return residents.get(index);
    }

    public Integer getRSize() {
        return this.residents.size();
    }

    public String getFilms(Integer index) {
        return films.get(index);
    }

    public Integer getFSize() {
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

    public void setRotation_period(String rotation_period) {
        this.rotation_period = rotation_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public void setSurface_water(String surface_water) {
        this.surface_water = surface_water;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void addResident(String resident) {
        this.residents.add(resident);
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

    public void addResident() {
    }



//    public String toString(){
//        return "\n Информация о планете: \n" + "наименование планеты: " + name +
//                "период вращения планеты: " + rotation_period +
//                "орбитальный период планеты: " + orbital_period +
//                "диаметр планеты: " + diameter +
//                "климат планеты: " + climate +
//                "гравитация планеты: " + gravity +
//                "местность планеты: " + terrain +
//                "поверхность воды планеты: " + surface_water +
//                "популяция планеты: " + population +
//                "жители планеты: " + residents + "фильмы, где появлялась планета"  + films +
//                "дата создания записи о планете: "+ created +
//                "дата последнего редактирования записи о планете: " + edited +
//                "ссылка на запись о планете: " + url;
//    }

}
