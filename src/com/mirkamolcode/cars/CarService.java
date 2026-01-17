package com.mirkamolcode.cars;

public class CarService {
    public void repairCar(Car car) {
        System.out.println("Car repaired: " + car.getMake() + " " + car.getModel());
    }

    public void washCar(Car car) {
        System.out.println("Car washed: " + car.getMake() + " " + car.getModel());
    }

    public void refuelCar(Car car) {
        System.out.println("Car refueled: " + car.getMake() + " " + car.getModel());
    }
}
