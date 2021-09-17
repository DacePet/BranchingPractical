package com.company;


import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 38;
        int num2 = 7;
        char option = '%';
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
