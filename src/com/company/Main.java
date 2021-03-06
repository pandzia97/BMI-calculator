package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("BMI Calculator");
        System.out.println("Enter your growth: ");
        final double growth = scanner.nextDouble();
        System.out.println("Enter your weight: ");
        final double weight = scanner.nextDouble();

        double bmi = weight / (growth * growth);
        System.out.println(bmi);
        if (bmi >= 40) {
            System.out.println("3 level obesity");
        } else if (bmi > 36) {
            System.out.println("2 level obesity");
        } else if (bmi > 24.9) {
            System.out.println("1 level obesity");
        } else if (bmi > 18.5) {
            System.out.println("Overweight");
        } else if (bmi > 17) {
            System.out.println("Underweight");
        } else if (bmi > 16) {
            System.out.println("Emaciation");
        } else if (bmi > 8.5) {
            System.out.println("Starvation");
        } else if (bmi > 0) {
            System.out.println("Underweight");
        } else {
            System.out.println("Error");
        }
    }
}