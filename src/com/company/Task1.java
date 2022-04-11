package com.company;

import java.util.Scanner;

public class Task1 {
    public void calculate() {
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
    }

}
