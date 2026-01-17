package com.mirkamolcode;

import com.mirkamolcode.cars.Car;
import com.mirkamolcode.cars.CarService;
import com.mirkamolcode.cars.Garage;
import com.mirkamolcode.people.Gender;
import com.mirkamolcode.people.Person;

public class Main {


    static void main() {
        Garage garage = new Garage(2);

        Car car1 = new Car("Toyota", "Corolla", 2021, "ABC123");
        Car car2 = new Car("Honda", "Civic", 2022, "XYZ789");

        garage.addCar(car1);
        garage.addCar(car2);

        Car[] allCars = garage.getAllCars();
        for (Car car : allCars) {
            System.out.println("Car: " + car.getMake() + " " + car.getModel() + " (" + car.getYear() + ")");
        }

        CarService carService = new CarService();
        carService.repairCar(car1);
        carService.washCar(car2);
    }
}
