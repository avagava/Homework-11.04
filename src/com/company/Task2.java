package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task2 {
    public void calculate() {
        //Task 2
        System.out.println("Welcome to Task 2 program");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number1, x;
        int number2, y;
        number1 = intScanner.nextInt();
        System.out.println("Please enter a second number greater than the first: ");
        number2 = intScanner.nextInt();
        int sum = 0;
        for (int i = number1; i <= number2; i++) {
            sum = sum + i;
        }
        if (number1 > number2) {
            System.out.println("Job completed.");
        } else {
            System.out.println("The sum is " + IntStream.rangeClosed(number1, number2).sum());
        }
    }
}
