package app.deserialize;

import com.mashape.unirest.http.exceptions.UnirestException;
import model.ArrayOfData;

import java.util.ArrayList;
import java.util.Scanner;

public class DeserializeMenu1 {
    public static void AskMenu(ArrayList<ArrayOfData> results) throws UnirestException {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(1) - Просмотреть данные объектов");
        System.out.println("(2) - Серелизовать");
        System.out.println("(3) - Выход\n");
        System.out.print("Ваш выбор: ");
        Integer option = in.nextInt();
        switch (option) {
            case 1:
                new DeserializeMenu2();
                break;
            case 2:
                System.out.println("Серелизую");
                break;
            case 3:
                break;
            default:
                System.out.println("\n Неверный вариант параметра, ппробуйте еще раз! \n");
                AskMenu(results);
                break;
        }
    }
}
