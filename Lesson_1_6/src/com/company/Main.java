package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        double a, b, c, D;
        double x_1, x_2;

        System.out.print("Enter variable (a): ");
        a = num.nextDouble();
        System.out.print("Enter variable (b): ");
        b = num.nextDouble();
        System.out.print("Enter variable (c): ");
        c = num.nextDouble();

        D = Math.pow(b, 2) - (4* a * c);
        System.out.println(D);

        if( D > 0 ) {
            x_1 = ((-1) * b + Math.sqrt(D)) / (2 * a);
            x_2 = ((-1) * b - Math.sqrt(D)) / (2 * a);
            System.out.println("X_1 = " + x_1);
            System.out.println("X_2 = " + x_2);
        }else if (D == 0) {
            x_1 = (-1) * b / 2 * a;
            System.out.println("X_1, X_2 = " + x_1);
        }else
            System.out.println("This equation has any root because D < 0.");


    }
}