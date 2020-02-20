package app.deserialize;

import com.mashape.unirest.http.exceptions.UnirestException;
import model.*;

import java.util.Scanner;

public class DeserializeMenu2 {
    public static Films AskMenu(Films films, Planets planets,
                                People people, Species species,
                                Spaceships spaceships, Vehicles vehicles) throws UnirestException {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(1) - Просмотреть данные объектов");
        System.out.println("(2) - Серелизовать");
        System.out.println("(3) - Выход\n");
        System.out.print("Ваш выбор: ");
        Integer option = in.nextInt();
        if (option == 1 ) {
            System.out.println("Выберите действие: \n");
            System.out.println("(1) - Фильмы");
            System.out.println("(2) - Планеты");
            System.out.println("(3) - Персонажи");
            System.out.println("(4) - Виды");
            System.out.println("(5) - Звездолёты");
            System.out.println("(6) - Транспортные средства");
            System.out.println("(7) - Выход\n");
            System.out.print("Ваш выбор: ");
            option = in.nextInt();
            switch (option) {
                case 1:
                    return new Films(films);
                case 2:
                    System.out.println("Серелизую");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\n Неверный вариант параметра, ппробуйте еще раз! \n");
                    AskMenu(films, planets, people, species, spaceships, vehicles);
                    break;
            }
        } else if (option == 2) {
            System.out.println("Выберите действие: \n");
            System.out.println("(1) - Просмотреть данные объектов");
            System.out.println("(2) - Серелизовать");
            System.out.println("(3) - Выход\n");
            System.out.print("Ваш выбор: ");
            option = in.nextInt();
            switch (option) {
                case 1:
                    break;
                case 2:
                    System.out.println("Серелизую");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\n Неверный вариант параметра, ппробуйте еще раз! \n");
                    AskMenu(films, planets, people, species, spaceships, vehicles);
                    break;
            }
        }
        return null;
    }
}
