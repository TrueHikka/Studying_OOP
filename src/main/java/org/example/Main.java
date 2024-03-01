package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите тип транспорта (либо полное название, либо цифры от 1 до 3): ");
//        String type = scanner.nextLine();

//        WheeledTransport transport = getWheeledTransport(type);
//        ServiceStation.visitServiceStation(transport);

       Bicycle bicycle1 = new Bicycle(2, 30, "Горный" );
       Bicycle bicycle2 = new Bicycle(2, 5, "Обычный скоростной");

//       Car car1 = new Car(4, 200, "Бензиновый", "Toyota", "Corolla");
//       Car car2 = new Car(4, 500, "Бензиновый", "Zhiguli", "Russian Autoprom");

        Car car1 = new Car.CarBuilder()
                .numberOfWheels(4)
                .maxSpeed(200)
                .engineType("Бензиновый")
                .hasBrandOfCar("Toyota")
                .hasModelOfCar("Corolla")
                .build();

        Car car2 = new Car.CarBuilder()
                .numberOfWheels(4)
                .maxSpeed(500)
                .engineType("Бензиновый")
                .hasBrandOfCar("Zhiguli")
                .hasModelOfCar("Russian Autoprom")
                .build();

       Truck truck1 = new Truck(6, 150, "Дизельный", 1000);
       Truck truck2 = new Truck(6, 120, "Дизельный", 1500);

        List<Transport> transports = new ArrayList<>();
        transports.add(bicycle1);
        transports.add(bicycle2);
        transports.add(car1);
        transports.add(car2);
        transports.add(truck1);
        transports.add(truck2);

        for (Transport transport : transports) {
            System.out.println("\n");
            ServiceStation.visitServiceStation(transport);
//            System.out.println(transport);
        }

//        scanner.close();
    }

    @NotNull
    private static WheeledTransport getWheeledTransport(@NotNull String type) {
        WheeledTransport transport;

        if (type.matches("\\d+")) {
            int typeInt = Integer.parseInt(type);
            if(typeInt == 1) {
                transport = new Bicycle(2, 30, "Горный");
            } else if (typeInt == 2) {
//                transport = new Car(4, 200, "Бензиновый", "Toyota", "Corolla");
                transport = new Car.CarBuilder()
                        .numberOfWheels(4)
                        .maxSpeed(200)
                        .engineType("Бензиновый")
                        .hasBrandOfCar("Toyota")
                        .hasModelOfCar("Corolla")
                        .build();

            } else if (typeInt == 3) {
                transport = new Truck(6, 150, "Дизельный", 1000);

            } else {
                throw new Error("Неверный формат ввода. Необходимо ввести цифры от 1 до 3");
            }
        } else if (type.equalsIgnoreCase("bicycle")) {
            transport = new Bicycle(2, 30, "Горный");
        } else if (type.equalsIgnoreCase("car")) {
            transport = new Car.CarBuilder()
                    .numberOfWheels(4)
                    .maxSpeed(200)
                    .engineType("Бензиновый")
                    .hasBrandOfCar("Toyota")
                    .hasModelOfCar("Corolla")
                    .build();
        } else if (type.equalsIgnoreCase("truck")) {
            transport = new Truck(6, 150, "Дизельный", 1000);
        } else {
            throw new Error("Неверный формат ввода. Такого транспорта не существует");
        }
        return transport;
    }
}