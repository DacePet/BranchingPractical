package com.company;

import java.util.Scanner;

public class Speed {
    public static void toMilesPerHour() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed km/h");
        final double coef = 0.621371;
        double kilometersPerHour = input.nextDouble();
        double milesPerHour = Math.round(kilometersPerHour * coef);
        if (kilometersPerHour < 0)
            System.out.println("-1");
        else
        System.out.println("Speed " + kilometersPerHour + " kilometers per hour equals " + milesPerHour + " miles per hour");
        return;
    }


    public static void main(String[] args) {
        toMilesPerHour();
    }
}