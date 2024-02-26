package org.example;

public abstract class WheeledTransport implements Transport {
    private Integer numberOfWheels;
    private Integer maxSpeed;

    public WheeledTransport(Integer numberOfWheels, Integer maxSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void service() {
        System.out.println("Обслужено колёс - " + numberOfWheels);
        System.out.println("Max скорость - " + maxSpeed);
    }

    @Override
    public String toString() {
        return "WheeledTransport{" +
                "numberOfWheels=" + numberOfWheels +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
