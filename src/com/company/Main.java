package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // Task 1
        System.out.println("Welcome to Task 1 program");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        int number, i;
        System.out.println("Please enter any number: ");
        number = intScanner.nextInt();
        for (i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\n");
            }
        }

        task2();
        task3();
    }

    static void task2() {
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

    static void task3() {
        //Task 3
        System.out.println("Welcome to Task 3 program");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int p, i;
        p = intScanner.nextInt();
        for (i = 1; i <= p; i++) {
            if ( (int)(Math.ceil((Math.log(p)/Math.log(2)))) == (int)(Math.floor((Math.log(p))/Math.log(2)))) {
                System.out.print(i + "\n");
            }
        }
        //I tried task 3; however, the program isn't working. So I will correct it.
    }
}
