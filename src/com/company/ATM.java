package com.company;

import java.util.Scanner;

public class ATM {
    static int balanceMain = 1000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operation = selectOperation(input);
        if (operation == 1) {
            displayBalance();
        }
        if (operation == 2) {
            takeOutMoney();
        }
        if (operation == 3) {
            deposit();
        }
        if (operation == 4) {
            exit();
        }
    }

    static int selectOperation(Scanner input) {
        System.out.println("Select Operation");
        System.out.println("1 - Check balance");
        System.out.println("2 - Money withdrawal");
        System.out.println("3 - Money deposit");
        System.out.println("4 - EXIT");
        return input.nextInt();
    }

    static int displayBalance() {
        System.out.println("Current Balance : " + balanceMain);
        return balanceMain;
    }

    static int takeOutMoney() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose amount you would  like to withdraw");
        int sum = input.nextInt();
        System.out.println((sum <= balanceMain) ? ("Take money. SUM:" + sum + "EUR") : ("Insufficient balance"));
        return input.nextInt();
    }

    static void deposit() {
        int temp;
        int balance = balanceMain;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        temp = input.nextInt();
        balanceMain = balanceMain + temp;
        System.out.println("Current balance: " + balanceMain);
    }

    static void exit() {
        System.out.println("Take your card");
    }
}


