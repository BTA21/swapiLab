import java.util.ArrayList;

/**
 * Класс для описания планет со свойствами <b>name</b>, <b>rotation_period</b>, <b>orbital_period</b>,
 * <b>diameter</b>, <b>climate</b>, <b>gravity</b>, <b>terrain</b>,
 * <b>surface_water</b>, <b>population</b>, <b>residents</b>,
 * <b>films</b>, <b>created</b>, <b>edited</b> и <b>url</b>.
 * @author Набиев Азамат Ильдусович
 * @version 1.1
 */
public class Planets {
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
     * @see Planets#Planets(String, String, String, String,
     * String, String, String, String, String, ArrayList,
     * ArrayList, String, String, String)
     */
    public Planets(String name, String rotation_period,
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
}
