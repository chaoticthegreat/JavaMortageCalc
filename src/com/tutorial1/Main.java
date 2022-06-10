package com.tutorial1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        while (!(principal >= 1000) || !(principal <= 1000000)) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal < 1000) {
                System.out.println("Principal must be at least 1000");
            } else if (principal > 1000000) {
                System.out.println("Principal must be at most 1000000");
            } else {
                break;
            }
        }
        double rate = 0.00;
        while (!(rate >= 1) || !(rate <= 30)) {
            System.out.print("Rate: ");
            rate = scanner.nextDouble();
            if (rate < 1) {
                System.out.println("Rate must be at least 1");
            } else if (rate > 30) {
                System.out.println("Rate must be at most 30");
            } else {
                break;
            }
        }
        rate = rate / 100 / 12;
        int years = 0;
        while (true) {
            System.out.print("Number of years: ");
            years = scanner.nextInt();
            if (years < 1) {
                System.out.println("Number of years must be at least 1");
            } else {
                break;
            }
        }
        int months = years*12;
        String formatter = NumberFormat.getCurrencyInstance().format(principal*(rate*Math.pow(1+rate, months))/(Math.pow(1+rate, months)-1));
        System.out.println("Total: " + formatter);
        scanner.close();
    }
}
