package com.mirkamolcode;

import com.mirkamolcode.carDealerships.CarDealership;
import com.mirkamolcode.cars.Car;
import com.mirkamolcode.cars.EngineType;
import com.mirkamolcode.people.Gender;
import com.mirkamolcode.people.Person;

public class Main {


    static void main() {
        Person malePerson = new Person("John", "Doe", Gender.M, "john.doe@example.com");

        Person femalePerson = new Person("Jane", "Smith",   Gender.F, "jane.smith@example.com");

        System.out.println("Male Person:");
        System.out.println("First Name: " + malePerson.getFirstName());
        System.out.println("Last Name: " + malePerson.getLastName());
        System.out.println("Gender: " + malePerson.getGender());
        System.out.println("Email: " + malePerson.getEmail());

        System.out.println();

        System.out.println("Female Person:");
        System.out.println("First Name: " + femalePerson.getFirstName());
        System.out.println("Last Name: " + femalePerson.getLastName());
        System.out.println("Gender: " + femalePerson.getGender());
        System.out.println("Email: " + femalePerson.getEmail());
    }
}
