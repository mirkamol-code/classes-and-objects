package com.mirkamolcode.carDealerships;

import com.mirkamolcode.cars.Car;

import java.util.Arrays;

public class CarDealership {
    private String name;
    private int maxCarsOnDisplay;
    private Car[] carsInStock;

    public CarDealership(String name, int maxCarsOnDisplay) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
        this.carsInStock = new Car[maxCarsOnDisplay];
    }

    public String getName() {
        return name;
    }

    public int getMaxCarsOnDisplay() {
        return maxCarsOnDisplay;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public void addCarToStock(Car car) {
        int currentStockSize = getCarsInStockCount();
        if (currentStockSize < maxCarsOnDisplay) {
            carsInStock[currentStockSize] = car;
            System.out.println(car.getManufacturer() + " " + car.getEngineType() + " car added to stock.");
        } else {
            System.out.println("Sorry, the maximum capacity of cars on display has been reached.");
        }
    }

    public int getCarsInStockCount() {
        int count = 0;
        for (Car car : carsInStock) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }

    public Car findCarByManufacturer(String manufacturer) {
        for (Car car : carsInStock) {
            if (car != null && car.getManufacturer().equalsIgnoreCase(manufacturer)) {
                return car;
            }
        }
        return null;
    }
}
