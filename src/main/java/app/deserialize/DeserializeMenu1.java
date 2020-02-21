package app.deserialize;

import com.mashape.unirest.http.exceptions.UnirestException;
import model.*;

import java.util.Scanner;

public class DeserializeMenu1 {
    public static Object AskMenu1(Films films, Planets planets,
                                  People people, Species species,
                                  Spaceships spaceships, Vehicles vehicles) throws UnirestException {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(1) - Просмотреть данные объектов");
        System.out.println("(2) - Выход\n");
        System.out.print("Ваш выбор: ");
        Integer option = in.nextInt();
        if (option == 1) {
            System.out.println("Выберите действие: \n");
            System.out.println("(0) - Сереализовать");
            System.out.println("(1) - Фильмы");
            System.out.println("(2) - Звездолёты");
            System.out.println("(3) - Планеты");
            System.out.println("(4) - Виды");
            System.out.println("(5) - Персонажи");
            System.out.println("(6) - Транспортные средства");
            System.out.println("(7) - Выход\n");
            System.out.print("Ваш выбор: ");
            option = in.nextInt();
            switch (option) {
                case 0:
                    DeserializeFactory.serializeData(2, films, planets, people, species, spaceships, vehicles);
                    break;
                case 1:
                    DeserializeMenu2.AskMenu1(films);
                    break;
                case 2:
                    DeserializeMenu2.AskMenu2(spaceships);
                    break;
                case 3:
                    DeserializeMenu2.AskMenu3(planets);
                    break;
                case 4:
                    DeserializeMenu2.AskMenu4(species);
                    break;
                case 5:
                    DeserializeMenu2.AskMenu5(people);
                    break;
                case 6:
                    DeserializeMenu2.AskMenu6(vehicles);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("\n Неверный вариант параметра, ппробуйте еще раз! \n");
                    AskMenu1(films, planets, people, species, spaceships, vehicles);
                    break;
            }
        }
        return null;
    }

    public static Object AskMenu2(Films films, Planets planets,
                                  People people, Species species,
                                  Spaceships spaceships, Vehicles vehicles,
                                  String json1, String json2, String json3,
                                  String json4, String json5, String json6) throws UnirestException {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(1) - Просмотреть данные объектов/json - содежимое после сериализации");
        System.out.println("(2) - Выход\n");
        System.out.print("Ваш выбор: ");
        Integer option = in.nextInt();
        if (option == 1) {
            System.out.println("Выберите действие: \n");
            System.out.println("(0) - Сереализовать");
            System.out.println("(1) - Фильмы");
            System.out.println("(2) - Звездолёты");
            System.out.println("(3) - Планеты");
            System.out.println("(4) - Виды");
            System.out.println("(5) - Персонажи");
            System.out.println("(6) - Транспортные средства");
            System.out.println("(7) - Выход\n");
            System.out.print("Ваш выбор: ");
            option = in.nextInt();
            switch (option) {
                case 0:
                    DeserializeFactory.serializeData(2, films, planets, people, species, spaceships, vehicles);
                    break;
                case 1:
                    DeserializeMenu2.AskMenu1(films, json2);
                    break;
                case 2:
                    DeserializeMenu2.AskMenu2(spaceships, json5);
                    break;
                case 3:
                    DeserializeMenu2.AskMenu3(planets, json1);
                    break;
                case 4:
                    DeserializeMenu2.AskMenu4(species, json4);
                    break;
                case 5:
                    DeserializeMenu2.AskMenu5(people, json3);
                    break;
                case 6:
                    DeserializeMenu2.AskMenu6(vehicles, json6);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("\n Неверный вариант параметра, ппробуйте еще раз! \n");
                    AskMenu2(films, planets, people, species, spaceships, vehicles, json1, json2, json3, json4, json5, json6);
                    break;
            }
        }
        return null;
    }
}
