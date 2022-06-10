package com.tutorial1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        while (!(principal >= 1000) || !(principal <= 1000000)) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();}
        System.out.print("Rate: ");
        double rate = scanner.nextDouble() / 100 / 12;
        System.out.print("Time: ");;
        int time = scanner.nextByte();
        time = time*12;
        String formatter = NumberFormat.getCurrencyInstance().format(principal*(rate*Math.pow(1+rate, time))/(Math.pow(1+rate, time)-1));
        System.out.println("Total: " + formatter);
        scanner.close();
    }
}
