package com.company;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the day number in the week:");
        int dayNo = input.nextInt();
        switch (dayNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a working day");
                break;
            case 6:
            case 7:
                System.out.println("It is a holiday");
                break;
            default:
                System.out.println("Wrong input");
        }}}




