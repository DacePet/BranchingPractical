package com.company;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours is the working day?");
        short workingHoursInDay = input.nextShort();
        if (workingHoursInDay < 0 || workingHoursInDay > 24)
            System.out.println("Wrong input");
        short hourSalary = 10;
        short extraHourSalary = 15;
        if (workingHoursInDay <= 8)
            System.out.println("Working day salary is" + " " + workingHoursInDay * hourSalary + " " + "eur");
        if (workingHoursInDay > 8 && workingHoursInDay <= 24)
            System.out.println("Working day salary is" + " " + (80 + ((workingHoursInDay - 8) * extraHourSalary)) + " " + "eur");
// if (workingHoursInDay<=8)

    }

}
