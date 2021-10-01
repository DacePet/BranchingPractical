package com.company;

import java.util.Scanner;

public class ATMv2 {
    public static void main(String[] args) {
        int balance = 1000, withdraw, deposit;
        Scanner s = new Scanner(System.in);

        while (true) {
            {
                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for EXIT");
                int no = s.nextInt();
                switch (no) {
                    case 1:
                        System.out.println("Enter amount to be withdraw");
                        withdraw = s.nextInt();
                        System.out.println((balance >= withdraw) ? ("Please collect  your money") : ("Insufficient Balance"));
                        break;
                    case 2:
                        System.out.println("Enter money to be deposited");
                        deposit = s.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully deposited");
                        break;
                    case 3:
                        System.out.println("Your Current Ballance is " + balance);
                        break;
                    case 4:
                        System.exit(0);

                }
            }
        }
    }
}