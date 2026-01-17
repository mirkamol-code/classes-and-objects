package com.mirkamolcode.cars;


public class Car {
    private String make;
    private String model;
    private int year;
    private String licensePlate;

    public Car(String make, String model, int year, String licensePlate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
    }

    // Getters and setters (optional)
    // You can also add other methods as needed

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    String getLicensePlate() {
        return licensePlate;
    }
}
