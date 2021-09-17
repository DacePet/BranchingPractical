package com.company;

import java.util.Scanner;

public class CalculationV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        System.out.println("Enter another number");
        int num2 = input.nextInt();
        System.out.println("Enter the option (+ sum; - substract; / devide; * multiply; % get remainder when first number is devided by second; p print both numbers; b verify which is bigger; s veryfy which is smaller)");
        // previous line looks not good, too long
        char option =input.next().charAt(0);
        System.out.println("Result is:");
        switch (option) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            case 'p':
                System.out.println(num1 + "; " + num2);
                break;
            case 'b':
                if (num1 > num2) {
                    System.out.println(num1 + " > " + num2);
                } else
                    System.out.println(num2 + " > " + num1);
                break;
            case 's':
                if (num1 < num2) {
                    System.out.println(num1 + " < " + num2);
                } else
                    System.out.println(num2 + " < " + num1);
                break;
        }
    }
}
