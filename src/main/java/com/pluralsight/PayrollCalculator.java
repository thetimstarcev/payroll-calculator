package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("How many hours did you work?");
        double hours = scanner.nextDouble();
        System.out.println("What is your pay rate?");
        double rate = scanner.nextDouble();
        System.out.println("Your gross pay is: " + (hours * rate));
    }
}