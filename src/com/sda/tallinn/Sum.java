package com.sda.tallinn;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter the whole number:");
            number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Total sum is: " + sum);
    }
}
