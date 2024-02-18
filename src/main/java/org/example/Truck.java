package org.example;

public class Truck extends MotorTransport {
    private Integer loadCapacity;

    public Truck(Integer numberOfWheels, Integer maxSpeed, String engineType, Integer loadCapacity) {
        super(numberOfWheels, maxSpeed, engineType);
        this.loadCapacity = loadCapacity;
    }

    public Integer getCapacityTrack() {
        return loadCapacity;
    }

    public void setCapacityTrack(Integer capacityTrack) {
        this.loadCapacity = capacityTrack;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Грузоподъемность - " + loadCapacity);
    }
}
