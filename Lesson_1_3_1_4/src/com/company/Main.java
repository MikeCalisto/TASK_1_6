package com.company;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        String first, day, day2;
        System.out.print("Enter the day(Sunday - Saturday) : ");
        first = num.next();
        day = "Monday";
        day2 = "Friday";

        Scanner num1 = new Scanner(System.in);
        int second, time, time2, time3;
        System.out.print("Enter the time : ");
        second = num1.nextInt();
        time = 18;
        time2 = 19;
        time3 = 20;

        if((first.equals(day) || first.equals(day2)) && (second == time || second == time2 || second == time3)) {
            System.out.println("Lesson is running");
            System.out.print("\n");
        }else
            System.out.println("Lesson is not running");
    }
}
