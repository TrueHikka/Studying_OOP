package org.example;

public final class Car extends MotorTransport {
    private String hasBrandOfCar;
    private String hasModelOfCar;

    @Override
    public String toString() {
        return "Car{" + "numberOfWheels=" + super.getNumberOfWheels() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", brandOfCar='" + hasBrandOfCar + '\'' +
                ", modelOfCar='" + hasModelOfCar + '\'' +
                '}';
    }

//    public Car(Integer numberOfWheels, Integer maxSpeed, String engineType, String brandOfCar, String modelOfCar) {
//        super(numberOfWheels, maxSpeed, engineType);
//        this.brandOfCar = brandOfCar;
//        this.modelOfCar = modelOfCar;
//    }
    private Car(CarBuilder builder) {
        super(builder.numberOfWheels, builder.maxSpeed, builder.engineType);
        this.hasBrandOfCar = builder.hasBrandOfCar;
        this.hasModelOfCar = builder.hasModelOfCar;
    }

//    public String getBrandOfCar() {
//        return brandOfCar;
//    }
//
//    public String getModelOfCar() {
//        return modelOfCar;
//    }
//
//    public void setBrandOfCar(String brandOfCar) {
//        this.brandOfCar = brandOfCar;
//    }
//
//    public void setModelOfCar(String modelOfCar) {
//        this.modelOfCar = modelOfCar;
//    }

    public static class CarBuilder {
        private Integer numberOfWheels;
        private Integer maxSpeed;
        private String engineType;
        private String hasBrandOfCar;
        private String hasModelOfCar;

        public CarBuilder() {

        }

        public CarBuilder numberOfWheels(Integer numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
            return this;
        }

        public CarBuilder maxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public CarBuilder engineType(String  engineType) {
            this.engineType = engineType;
            return this;
        }

        public CarBuilder hasBrandOfCar(String hasBrandOfCar) {
            this.hasBrandOfCar = hasBrandOfCar;
            return this;
        }

        public CarBuilder hasModelOfCar(String hasModelOfCar) {
            this.hasModelOfCar = hasModelOfCar;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

    public final void carMethod() {
        System.out.println("Машинка играет в шашечки");
    }

    @Override
    public void service() {
        super.service();
        checkBrandAndModelOfCar();
    }

    private void checkBrandAndModelOfCar() {
        System.out.println("Фирма машины - " + hasBrandOfCar + ", марка машины - " + hasModelOfCar);
    }


}
