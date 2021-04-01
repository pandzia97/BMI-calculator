package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BMI Calculator");
        System.out.println("Enter your growth: ");
        double growth = scanner.nextDouble();
        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();
        double bmi = weight / (growth * growth);

        if (bmi < 18.5) {
            System.out.println("You have underweight");
        } else if (18.5 < bmi && bmi < 24.8) {
            System.out.println("Good");
        } else if (25 < bmi && bmi < 29.9) {
            System.out.println("You have overweight");
        } else {
            System.out.println("You are fat");
        }
    }
}
