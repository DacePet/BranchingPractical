package com.company;

import java.util.Scanner;

public class DayNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number of the year");
        int day = input.nextInt();
        System.out.println("The day number is" + " " + day);
        // I am sure, there is a shorter way to code "if", but I tried to define int feb = jan +28 OR 31+28 OR same in scopes etc, it did not work for me.
        // also leap year option is not included in this code
        int jan = 31;
        int feb = 28;
        int mar = 31;
        int apr = 30;
        int may = 31;
        int jun = 30;
        int jul = 31;
        int aug = 31;
        int sep = 30;
        int oct = 31;
        int nov = 30;
        int dec = 31;
        if (day<=0 || day>(jan+feb+mar+apr+may+jun+jul+aug+sep+oct+nov+dec))
            System.out.println("Wrong input");
        if (day >= 1 && day <= jan)
            System.out.println("It is: January");
        if (day > jan && day <= (jan + feb))
            System.out.println("It is: February");
        if (day > (jan + feb) && day <= (jan + feb + mar))
            System.out.println("It is: March");
        if (day > (jan + feb + mar) && day <= jan + feb + mar + apr)
            System.out.println("It is: April");
        if (day > (jan + feb + mar + apr) && day <= (jan + feb + mar + apr + may))
            System.out.println("It is: May");
        if (day > (jan + feb + mar + apr + may) && day <= (jan + feb + mar + apr + may + jun))
            System.out.println("It is: June");
        if (day > (jan + feb + mar + apr + may + jun) && day <= (jan + feb + mar + apr + may + jun + jul))
            System.out.println("It is: July");
        if (day > (jan + feb + mar + apr + may + jun+jul) && day <= (jan + feb + mar + apr + may + jun + jul + aug))
            System.out.println("It is: August");
        if (day > (jan + feb + mar + apr + may + jun + jul + aug) && day <= (jan + feb + mar + apr + may + jun + jul + aug + sep))
            System.out.println("It is: September");
        if (day > (jan + feb + mar + apr + may + jun + jul + aug + sep) && day <= (jan + feb + mar + apr + may + jun + jul + aug + sep + oct))
            System.out.println("It is: October");
        if (day > (jan + feb + mar + apr + may + jun + jul + aug + sep + oct) && day <= (jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov))
            System.out.println("It is: November");
        if (day > (jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov) && day <= (jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov + dec))
            System.out.println("It is: December");

    }
}