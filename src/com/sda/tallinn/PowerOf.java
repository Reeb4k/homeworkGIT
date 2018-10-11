package com.sda.tallinn;

import java.util.Scanner;

public class PowerOf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number a - which we are going to power:");
        int a = scanner.nextInt();
        int numberInPower = a;

        System.out.println("Please enter positive number b - which is going to be a power:");
        int b = scanner.nextInt();
        if (b <= 0){
            System.out.println("Error! b has to be positive!");
        }


        for (int i = 1;  i < b; i++) {
            numberInPower *= a;
        }
        System.out.println("Number a in power b is: " + numberInPower);

    }
}
