package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type yr name: \n");
        String name = scanner.next();

        System.out.println("Type yr hours: \n");
        Double hours = scanner.nextDouble();

        System.out.println("Type yr hourly wage: \n");
        Double wage = scanner.nextDouble();

        final double TAX = 0.20;
        double pay = hours*wage;

        if (hours >= 45) {
            double OThrs = hours - 45;
            pay += (OThrs * (1.5*wage));
        }
    }
}
