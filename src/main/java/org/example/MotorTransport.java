package org.example;

public abstract class MotorTransport extends WheeledTransport {
    private String engineType;

    public MotorTransport(Integer numberOfWheels, Integer maxSpeed, String engineType) {
        super(numberOfWheels, maxSpeed);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void service() {
        super.service();
        checkEngineType();
    }

    private void checkEngineType() {
        System.out.println("Обслуживаемый тип двигателя: " + engineType);
    }
}
