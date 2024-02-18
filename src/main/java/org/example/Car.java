package org.example;

public final class Car extends MotorTransport {
    private String brandOfCar;
    private String modelOfCar;

    public Car(Integer numberOfWheels, Integer maxSpeed, String engineType, String brandOfCar, String modelOfCar) {
        super(numberOfWheels, maxSpeed, engineType);
        this.brandOfCar = brandOfCar;
        this.modelOfCar = modelOfCar;
    }

    public String getBrandOfCar() {
        return brandOfCar;
    }

    public String getModelOfCar() {
        return modelOfCar;
    }

    public void setBrandOfCar(String brandOfCar) {
        this.brandOfCar = brandOfCar;
    }

    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    public final void carMethod() {
        System.out.println("Машинка играет в шашечки");
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Фирма машины - " + brandOfCar + ", марка машины - " + modelOfCar);
    }
}
