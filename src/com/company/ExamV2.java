package com.company;

import java.util.Scanner;

public class ExamV2 {
           public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
char grade='C';
            switch (grade){
                case 'A':
                case 'B':
                    System.out.println("Perfect! You are so clever!");
                    break;
                // In assignment B defined as Perfect, but in task: Try your algorithm wth grade B - there is a mistake.
                case 'C':
                    System.out.println("Good! But you can do better!");
                    break;
                case 'D':
                case 'E':
                    System.out.println("It is not good! You shoud study!");
                    break;
                case 'F':
                    System.out.println("Fail! You need to repeat the exam!");
                    break;
                default:
                    System.out.println("Wrong input");
}}}
