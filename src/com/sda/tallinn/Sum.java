package com.sda.tallinn;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Please enter a whole number of elements to scan: ");
        int amountOfElementsToScan = scanner.nextInt();
        if (amountOfElementsToScan <= 0) {
            System.out.println("This number must be greater than 0!");
        } else {
            for (int i = 0; i < amountOfElementsToScan; i++) {
                System.out.println("Please enter the whole number:");
                number = scanner.nextInt();
                sum += number;
            }
            System.out.println("Total sum is: " + sum);
        }
    }
}
