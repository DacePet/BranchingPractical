package com.company;

import java.util.Scanner;

public class ATM {
    static int balanceMain = 1000;
    static final int pinCodeMain = 1234;

    public static void main(String[] args) {
        boolean b1 = enterPin();
        if (b1) {
            mainMenu();
        } else {
            System.out.println("Wrong pin code");
        }
    }

    static boolean enterPin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your pin code: ");
        int pinCode = input.nextInt();
        return pinCode == pinCodeMain;
    }

    // method above: from what i understood, boolean generally can have either true or false value,
    // and therefore boolean method returns true value if condition that is
    // stipulated after 'return' is met;

    static void mainMenu() {
        Scanner input = new Scanner(System.in);
        int operation = selectOperation(input);
        switch (operation) {
            case 1:
                displayBalance();
                break;
            // above meaning is the same as
            // case 1:
            // displayBalance();
            // break;
            // improvement with '->' was suggested by IntelliJ;
            // in fact IntelliJ didn't want to allow me to push to gitHub without this improvement
            case 2:
                takeOutMoney();
                break;
            case 3:
                deposit();
                break;
            case 0:
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    static void displayBalance() {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 - display on screen");
        System.out.println("Press 2 - print on paper");
        System.out.println("Enter your choice: ");
        int screenPaper = input.nextInt();
        switch (screenPaper) {
            case 1:
                System.out.println("Your current balance is: " + balanceMain + " EUR");
                break;
            case 2:
                System.out.println("The planet is out of trees, no paper for you today");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    static void takeOutMoney() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you would like to withdraw");
        int withdraw = input.nextInt();
        System.out.println((withdraw <= balanceMain) ? ("Please take your money: " + withdraw + " EUR") : ("Insufficient funds"));
        //if (withdraw<= balanceMain) {
        //  System.out.println("Remaining balance: " + (balanceMain - withdraw) + " EUR");
        //}
    }

    static void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you would like to deposit: ");
        int temp = input.nextInt();
        System.out.println("Your deposit " + temp + " EUR is transferred to Your account");
        // ("Current balance: " + (balanceMain + temp) + " EUR");
    }

    static int selectOperation(Scanner input) {
        System.out.println("Press 1 - account balance");
        System.out.println("Press 2 - money withdrawal");
        System.out.println("Press 3 - money deposit");
        System.out.println("Press 0 - exit");
        System.out.println("Enter your choice: ");
        return input.nextInt();
    }

}