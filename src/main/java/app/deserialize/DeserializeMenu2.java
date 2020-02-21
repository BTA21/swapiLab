package app.deserialize;

import model.*;

import java.util.Scanner;

public class DeserializeMenu2 {
    public static Films AskMenu1(Films films) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(1) - Просмотреть данные о всех фильмах");
        System.out.println("(2) - Просмотреть данные о фильме с названием");
        System.out.println("(3) - Просмотреть данные о фильме с индексом");
        System.out.println("(4) - Выход\n");
        System.out.print("Ваш выбор: ");
        Integer option = in.nextInt();
        if (option == 1 ) {
            return new Films(films);
        } else if (option == 2) {
            System.out.println("Введите название фильма: \n");
            String title = in.next();
            new Films(films, title);
            AskMenu1(films);

        } else if (option == 3) {
            System.out.println("Введите индекс фильма (массив начинается с 0): \n");
            Integer index = in.nextInt();
            new Films(films, index);
            AskMenu1(films);
        }
        return null;
    }

    public static Spaceships AskMenu2(Spaceships spaceships) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(1) - Просмотреть данные о всех звездолётах");
        System.out.println("(2) - Просмотреть данные о звездолёте с названием");
        System.out.println("(3) - Просмотреть данные о звездолёте с индексом");
        System.out.println("(4) - Выход\n");
        System.out.print("Ваш выбор: ");
        Integer option = in.nextInt();
        if (option == 1 ) {
            return new Spaceships(spaceships);
        } else if (option == 2) {
            System.out.println("Введите название звездолёта: \n");
            String name = in.next();
            new Spaceships(spaceships, name);
            AskMenu2(spaceships);

        } else if (option == 3) {
            System.out.println("Введите индекс звездолёта (массив начинается с 0): \n");
            Integer index = in.nextInt();
            new Spaceships(spaceships, index);
            AskMenu2(spaceships);
        }
        return null;
    }

    public static Planets AskMenu3(Planets planets) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(1) - Просмотреть данные о всех планетах");
        System.out.println("(2) - Просмотреть данные о планете с названием");
        System.out.println("(3) - Просмотреть данные о планете с индексом");
        System.out.println("(4) - Выход\n");
        System.out.print("Ваш выбор: ");
        Integer option = in.nextInt();
        if (option == 1 ) {
            return new Planets(planets);
        } else if (option == 2) {
            System.out.println("Введите название планеты: \n");
            String name = in.next();
            new Planets(planets, name);
            AskMenu3(planets);

        } else if (option == 3) {
            System.out.println("Введите индекс планеты (массив начинается с 0): \n");
            Integer index = in.nextInt();
            new Planets(planets, index);
            AskMenu3(planets);
        }
        return null;
    }

    public static Species AskMenu4(Species species) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(1) - Просмотреть данные о всех видах");
        System.out.println("(2) - Просмотреть данные о виде с названием");
        System.out.println("(3) - Просмотреть данные о виде с индексом");
        System.out.println("(4) - Выход\n");
        System.out.print("Ваш выбор: ");
        Integer option = in.nextInt();
        if (option == 1 ) {
            return new Species(species);
        } else if (option == 2) {
            System.out.println("Введите название вида: \n");
            String name = in.next();
            new Species(species, name);
            AskMenu4(species);

        } else if (option == 3) {
            System.out.println("Введите индекс вида (массив начинается с 0): \n");
            Integer index = in.nextInt();
            new Species(species, index);
            AskMenu4(species);
        }
        return null;
    }

    public static People AskMenu5(People people) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(1) - Просмотреть данные о всех персонажах");
        System.out.println("(2) - Просмотреть данные о персонаже с именем");
        System.out.println("(3) - Просмотреть данные о персонаже с индексом");
        System.out.println("(4) - Выход\n");
        System.out.print("Ваш выбор: ");
        Integer option = in.nextInt();
        if (option == 1 ) {
            return new People(people);
        } else if (option == 2) {
            System.out.println("Введите название персонажа: \n");
            String name = in.next();
            new People(people, name);
            AskMenu5(people);

        } else if (option == 3) {
            System.out.println("Введите индекс персонажа (массив начинается с 0): \n");
            Integer index = in.nextInt();
            new People(people, index);
            AskMenu5(people);
        }
        return null;
    }

    public static Vehicles AskMenu6(Vehicles vehicles) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(1) - Просмотреть данные о всех транспортных средствах");
        System.out.println("(2) - Просмотреть данные о транспортном средстве с названием");
        System.out.println("(3) - Просмотреть данные о транспортном средстве с индексом");
        System.out.println("(4) - Выход\n");
        System.out.print("Ваш выбор: ");
        Integer option = in.nextInt();
        if (option == 1 ) {
            return new Vehicles(vehicles);
        } else if (option == 2) {
            System.out.println("Введите название транспортного средства: \n");
            String name = in.next();
            new Vehicles(vehicles, name);
            AskMenu6(vehicles);

        } else if (option == 3) {
            System.out.println("Введите индекс транспортного средства (массив начинается с 0): \n");
            Integer index = in.nextInt();
            new Vehicles(vehicles, index);
            AskMenu6(vehicles);
        }
        return null;
    }

    public static Films AskMenu1(Films films, String json) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(0) - Просмотреть json-данные о фильмах");
        System.out.println("(1) - Просмотреть данные о всех фильмах");
        System.out.println("(2) - Просмотреть данные о фильме с названием");
        System.out.println("(3) - Просмотреть данные о фильме с индексом");
        System.out.println("(4) - Выход\n");
        System.out.print("Ваш выбор: \n\n\n");
        Integer option = in.nextInt();
        if (option == 0 ) {
            System.out.println(json);
        } else if (option == 1 ) {
            return new Films(films);
        } else if (option == 2) {
            System.out.println("Введите название фильма: \n");
            String title = in.next();
            new Films(films, title);
            AskMenu1(films);
        } else if (option == 3) {
            System.out.println("Введите индекс фильма (массив начинается с 0): \n");
            Integer index = in.nextInt();
            new Films(films, index);
            AskMenu1(films);
        }
        return null;
    }

    public static Spaceships AskMenu2(Spaceships spaceships, String json) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(0) - Просмотреть json-данные о звездолётах");
        System.out.println("(1) - Просмотреть данные о всех звездолётах");
        System.out.println("(2) - Просмотреть данные о звездолёте с названием");
        System.out.println("(3) - Просмотреть данные о звездолёте с индексом");
        System.out.println("(4) - Выход\n");
        System.out.print("Ваш выбор: \n\n\n");
        Integer option = in.nextInt();
        if (option == 0 ) {
          System.out.println(json);
        } else if (option == 1 ) {
            return new Spaceships(spaceships);
        } else if (option == 2) {
            System.out.println("Введите название звездолёта: \n");
            String name = in.next();
            new Spaceships(spaceships, name);
            AskMenu2(spaceships);
        } else if (option == 3) {
            System.out.println("Введите индекс звездолёта (массив начинается с 0): \n");
            Integer index = in.nextInt();
            new Spaceships(spaceships, index);
            AskMenu2(spaceships);
        }
        return null;
    }

    public static Planets AskMenu3(Planets planets, String json) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(0) - Просмотреть json-данные о планетах");
        System.out.println("(1) - Просмотреть данные о всех планетах");
        System.out.println("(2) - Просмотреть данные о планете с названием");
        System.out.println("(3) - Просмотреть данные о планете с индексом");
        System.out.println("(4) - Выход\n");
        System.out.print("Ваш выбор: \n\n\n");
        Integer option = in.nextInt();
        if (option == 0 ) {
            System.out.println(json);
        } else if (option == 1 ) {
            return new Planets(planets);
        } else if (option == 2) {
            System.out.println("Введите название планеты: \n");
            String name = in.next();
            new Planets(planets, name);
            AskMenu3(planets);
        } else if (option == 3) {
            System.out.println("Введите индекс планеты (массив начинается с 0): \n");
            Integer index = in.nextInt();
            new Planets(planets, index);
            AskMenu3(planets);
        }
        return null;
    }

    public static Species AskMenu4(Species species, String json) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(0) - Просмотреть json-данные о видах");
        System.out.println("(1) - Просмотреть данные о всех видах");
        System.out.println("(2) - Просмотреть данные о виде с названием");
        System.out.println("(3) - Просмотреть данные о виде с индексом");
        System.out.println("(4) - Выход\n");
        System.out.print("Ваш выбор: \n\n\n");
        Integer option = in.nextInt();
        if (option == 0 ) {
            System.out.println(json);
        } else if (option == 1 ) {
            return new Species(species);
        } else if (option == 2) {
            System.out.println("Введите название вида: \n");
            String name = in.next();
            new Species(species, name);
            AskMenu4(species);
        } else if (option == 3) {
            System.out.println("Введите индекс вида (массив начинается с 0): \n");
            Integer index = in.nextInt();
            new Species(species, index);
            AskMenu4(species);
        }
        return null;
    }

    public static People AskMenu5(People people, String json) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(0) - Просмотреть json-данные о персонажах");
        System.out.println("(1) - Просмотреть данные о всех персонажах");
        System.out.println("(2) - Просмотреть данные о персонаже с именем");
        System.out.println("(3) - Просмотреть данные о персонаже с индексом");
        System.out.println("(4) - Выход\n");
        System.out.print("Ваш выбор: \n\n\n");
        Integer option = in.nextInt();
        if (option == 0 ) {
            System.out.println(json);
        } else if (option == 1 ) {
            return new People(people);
        } else if (option == 2) {
            System.out.println("Введите название персонажа: \n");
            String name = in.next();
            new People(people, name);
            AskMenu5(people);

        } else if (option == 3) {
            System.out.println("Введите индекс персонажа (массив начинается с 0): \n");
            Integer index = in.nextInt();
            new People(people, index);
            AskMenu5(people);
        }
        return null;
    }

    public static Vehicles AskMenu6(Vehicles vehicles, String json) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: \n");
        System.out.println("(0) - Просмотреть json-данные о транспортных средствах");
        System.out.println("(1) - Просмотреть данные о всех транспортных средствах");
        System.out.println("(2) - Просмотреть данные о транспортном средстве с названием");
        System.out.println("(3) - Просмотреть данные о транспортном средстве с индексом");
        System.out.println("(4) - Выход\n");
        System.out.print("Ваш выбор: \n\n\n");
        Integer option = in.nextInt();
        if (option == 0 ) {
            System.out.println(json);
        } else  if (option == 1 ) {
            return new Vehicles(vehicles);
        } else if (option == 2) {
            System.out.println("Введите название транспортного средства: \n");
            String name = in.next();
            new Vehicles(vehicles, name);
            AskMenu6(vehicles);

        } else if (option == 3) {
            System.out.println("Введите индекс транспортного средства (массив начинается с 0): \n");
            Integer index = in.nextInt();
            new Vehicles(vehicles, index);
            AskMenu6(vehicles);
        }
        return null;
    }
}
