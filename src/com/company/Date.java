package com.company;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // I switced from beginning to the second part of the task- with console inputs.
        System.out.println("Please write the day");
        int day = input.nextInt();
        System.out.println("Please write the month");
        int month = input.nextInt();
        System.out.println("Please write the year");
        int year = input.nextInt();
        if ((day < 1 || day > 31 || month < 1 || month > 12 || year < 1) ||
                (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) ||
                (day > 28 && month == 2 && year % 4 != 0) ||
                (day > 29 && month == 2))
            System.out.println("Invalid date");
        else
            System.out.println("Please select the date formating. 1 - YYYY/MM/DD, 2 - YYYY.MM.DD");
        int format = input.nextInt();
        char separator = input.next().charAt(0);
        if (format == 1) {
            separator = '/';
        }
        if (format == 2) {
            separator = '.';
        }
        // TODO - not using separator correctly

        System.out.println("Your date is" + " " + year + separator + month + separator + day);
        //int format = input.nextInt();
        //   if (format == 1)
        //    System.out.println("Your date is" + " " + year + "/" + month + "/" + day);
        //   if (format == 2) {
        // System.out.println("Your date is" + " " + year + "." + month + "." + day);

    }

}


