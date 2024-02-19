package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задание - 2
        Player player1 = new Player(90);
        Player player2 = new Player(94);
        Player player3 = new Player(94);
        Player player4 = new Player(94);
        Player player5 = new Player(94);
        Player player6 = new Player(94);

        for (int i = 0; i < 91; i++) {
            player1.run();
        }
        System.out.println(Player.getCountPlayers());
        Player.info();

        Player player7 = new Player(94);
        System.out.println(Player.getCountPlayers());
        Player.info();

        Player player8 = new Player(94);
        Player.info();

//        Задание - 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип транспорта (либо полное название, либо цифры от 1 до 3): ");
        String type = scanner.nextLine();

        WheeledTransport transport = getWheeledTransport(type);

        visitServiceStation(transport);
        scanner.close();
    }

    @NotNull
    private static WheeledTransport getWheeledTransport(@NotNull String type) {
        WheeledTransport transport;

        if (type.matches("\\d+")) {
            int typeInt = Integer.parseInt(type);
            if(typeInt == 1) {
                transport = new Bicycle(2, 30, "Горный");
            } else if (typeInt == 2) {
                transport = new Car(4, 200, "Бензиновый", "Toyota", "Corolla");

            } else if (typeInt == 3) {
                transport = new Truck(6, 150, "Дизельный", 1000);

            } else {
                throw new Error("Неверный формат ввода. Необходимо ввести цифры от 1 до 3");
            }
        } else if (type.equalsIgnoreCase("bicycle")) {
            transport = new Bicycle(2, 30, "Горный");
        } else if (type.equalsIgnoreCase("car")) {
            transport = new Car(4, 200, "Бензиновый", "Toyota", "Corolla");
        } else if (type.equalsIgnoreCase("truck")) {
            transport = new Truck(6, 150, "Дизельный", 1000);
        } else {
            throw new Error("Неверный формат ввода. Такого транспорта не существует");
        }
        return transport;
    }

    private static void visitServiceStation(@NotNull WheeledTransport transport) {
        transport.service();
        if (transport instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) transport;
            bicycle.bicycleMethod();
        } else if (transport instanceof Car) {
            Car car = (Car) transport;
            car.carMethod();
        } else if (transport instanceof Truck) {
            Truck truck = (Truck) transport;
            truck.truckMethod();
        }
    }
}