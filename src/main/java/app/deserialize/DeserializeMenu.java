package app.deserialize;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.Scanner;

public class DeserializeMenu {
    public static void AskMenu() throws UnirestException {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(1) - Десереализовать");
        System.out.println("(2) - Выход\n");
        System.out.print("Ваш выбор: ");
        Integer option = in.nextInt();
        switch (option) {
            case 1:
                DeserializeFactory.deserializeData(1);
                break;
            case 2:
                break;
            default:
                System.out.println("\n Неверный вариант параметра, ппробуйте еще раз! \n");
                AskMenu();
                break;
        }
    }
}
