package org.example;

public final class Bicycle extends WheeledTransport {
    private String typeOfBike;

    public Bicycle(Integer numberOfWheels, Integer maxSpeed, String typeOfBike) {
        super(numberOfWheels, maxSpeed);
        this.typeOfBike = typeOfBike;
    }

    public String getTypeOfBike() {
        return typeOfBike;
    }

    public void getTypeOfBike(String typeOfBike) {
        this.typeOfBike = typeOfBike;
    }

    public final void bicycleMethod() {
        System.out.println("Велик едет неспеша");
    }

    @Override
    public void service() {
        super.service();
        checkTypeOfBike();
    }

    private void checkTypeOfBike() {
        System.out.println("Обслужено навесное оборудование велосипеда типа: " + typeOfBike);
    }

    @Override
    public String toString() {
        return "Bicycle{" + "numberOfWheels=" + super.getNumberOfWheels() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", typeOfBike='" + typeOfBike + '\'' +
                '}';
    }
}