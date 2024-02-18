package org.example;

public class Main {
    public static void main(String[] args) {
        WheeledTransport transport1 = new Bicycle(2, 30, "Горный");
        WheeledTransport transport2 = new Car(4, 200, "Бензиновый", "Toyota", "Corolla");
        WheeledTransport transport3 = new Truck(6, 150, "Дизельный", 1000);

        visitServiceStation(transport1);
        System.out.println(' ');
        visitServiceStation(transport2);
        System.out.println(' ');
        visitServiceStation(transport3);

    }
    public static void visitServiceStation(WheeledTransport transport) {
        transport.service();
    }
}