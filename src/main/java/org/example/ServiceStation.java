package org.example;

import org.jetbrains.annotations.NotNull;

public class ServiceStation {

    public static void visitServiceStation(@NotNull Transport transport) {
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
