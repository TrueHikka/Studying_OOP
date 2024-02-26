package org.example;

public final class Truck extends MotorTransport {
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

    public final void truckMethod() {
        System.out.println("Грузовичок грузит грузяку");
    }

    @Override
    public void service() {
        super.service();
        checkLoadCapacity();
    }

    private void checkLoadCapacity() {
        System.out.println("Грузоподъемность - " + loadCapacity);
    }

    @Override
    public String toString() {
        return "Truck{" + "numberOfWheels=" + super.getNumberOfWheels() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}
