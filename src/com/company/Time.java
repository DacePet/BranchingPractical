package com.company;

public class Time {
    public static void main(String[] args) {
        double time = 12;
        if (time >= 6 && time <= 12)
            System.out.println("Good Morning Sunshine!");
        else if (time >= 13 && time <= 19)
            System.out.println("Good Afternoon. Work Hard!");
        else if (time >= 20 && time <= 24)
            System.out.println("Good Evening. Get some rest!");
        else if (time < 0 || time > 24)
            System.out.println("Invalid time, please check and correct");
        else if (time >= 0 && time < 6)
            System.out.println("Sleep well!");
           }
}
