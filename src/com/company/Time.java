package com.company;

public class Time {
    public static void main(String[] args) {
        double time = 6;
        if (time >= 6 && time <= 12)
            System.out.println("Good Morning Sunshine!");
        if (time >= 13 && time <= 19)
            System.out.println("Good Afternoon. Work Hard!");
        if (time >= 20 && time <= 24)
            System.out.println("Good Evening. Get some rest!");
        if (time < 0 || time > 24)
            System.out.println("Invalid time, please check and correct");
        if (time >= 0 && time < 6)
            System.out.println("Sleep well!");
    }
}
