package com.mirkamolcode;

import com.mirkamolcode.carDealerships.CarDealership;
import com.mirkamolcode.cars.Car;
import com.mirkamolcode.cars.EngineType;

public class Main {


    static void main() {
        CarDealership dealership = new CarDealership("XYZ Auto", 5);

        dealership.addCarToStock(new Car("Toyota", 25000.0,EngineType.PETROL));
        dealership.addCarToStock(new Car("Tesla", 75000.0, EngineType.ELECTRIC));
        dealership.addCarToStock(new Car("Honda", 28000.0, EngineType.HYBRID));
        dealership.addCarToStock(new Car("Toyota", 32000.0,EngineType.DIESEL));
        dealership.addCarToStock(new Car("Nissan", 22000.0,EngineType.PETROL));

        System.out.println("Number of cars initially: " + dealership.getCarsInStockCount());

        String searchManufacturer = "Toyota";
        Car foundCar = dealership.findCarByManufacturer(searchManufacturer);
        if (foundCar != null) {
            System.out.println("Car found with manufacturer '" + searchManufacturer + "':");
            System.out.println(foundCar);
        } else {
            System.out.println("Car with manufacturer '" + searchManufacturer + "' not found in the dealership's stock.");
        }
    }
}
