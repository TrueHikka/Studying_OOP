package org.example;

public class WheeledTransport {
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

    public void  service() {
        System.out.println("Обслужено колёс - " + numberOfWheels);
    }

    @Override
    public String toString() {
        return "WheeledTransport{" +
                "numberOfWheels=" + numberOfWheels +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
