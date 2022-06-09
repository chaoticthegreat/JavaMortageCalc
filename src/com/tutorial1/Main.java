package com.tutorial1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
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
