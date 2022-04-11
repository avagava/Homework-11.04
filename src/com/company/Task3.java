package com.company;

import java.util.Scanner;

public class Task3 {
    public void calculate() {
        //Task 3
        System.out.println("Welcome to Task 3 program");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int power = scanner.nextInt();
        int start = 1;
        do {
            System.out.println(start);
            start = start * 2;
        } while (start < power);

    }
}
