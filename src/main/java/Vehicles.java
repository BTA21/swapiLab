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
public class Vehicles {
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
     * @see Vehicles#Vehicles(String, String, String, String,
     * String, String, String, String, String, String, String,
     * ArrayList, ArrayList, String, String, String)
     */
    public Vehicles(String name, String model, String manufacturer,
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
}
