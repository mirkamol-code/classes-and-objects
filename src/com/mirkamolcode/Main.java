package com.mirkamolcode;

import com.mirkamolcode.cars.Car;
import com.mirkamolcode.cars.CarService;
import com.mirkamolcode.cars.Garage;
import com.mirkamolcode.people.Gender;
import com.mirkamolcode.people.Person;
import com.mirkamolcode.questionnaire.Question;
import com.mirkamolcode.questionnaire.Questionnaire;
import com.mirkamolcode.questionnaire.QurestionnairePerson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {


    static void main() {
        // Create a questionnaire with id 1
        Questionnaire questionnaire = new Questionnaire(1);

        // Add some sample questions
        questionnaire.addQuestion(new Question("What is your favorite color?"));
        questionnaire.addQuestion(new Question("How often do you exercise?"));

        // Get user details
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dobStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = null;
        try {
            dob = dateFormat.parse(dobStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create a Person object with user details
        QurestionnairePerson person = new QurestionnairePerson(name, email, dob);

        // Answer the questions
        String[] answers = new String[questionnaire.getQuestions().size()];
        for (int i = 0; i < questionnaire.getQuestions().size(); i++) {
            System.out.print(questionnaire.getQuestions().get(i).getQuestionText() + ": ");
            answers[i] = scanner.nextLine();
        }

        // Save the user answers to a file
        saveAnswersToFile(person, answers);

        scanner.close();
    }

    private static void saveAnswersToFile(QurestionnairePerson person, String[] answers) {
        String fileName = "survey_answers.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write("Name: " + person.getName() + "\n");
            writer.write("Email: " + person.getEmail() + "\n");
            writer.write("Date of Birth: " + person.getDob() + "\n");
            for (int i = 0; i < answers.length; i++) {
                writer.write("Question " + (i + 1) + ": " + answers[i] + "\n");
            }
            writer.write("\n");
            writer.close();

            System.out.println("Survey answers saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the survey answers.");
            e.printStackTrace();
        }
    }
}
