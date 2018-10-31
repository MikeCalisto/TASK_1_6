package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main_triangle {

    public static void main(String[] args){

        //double	hypot(double x, double y)	Возвращает длину гипотенузы (sqrt(x2 +y2))
        //cos(double a) — возвращает косинус аргумента

        Scanner side = new Scanner(System.in);
        double a, b, c , v, u, j;             // a / b / c - sides
        double x1, x2, x3;          // x1 / x2 / x3 - angles
        double angle1 = 0, angle2 = 0, angle3 = 0;


        System.out.print("Enter side (a): ");
        a = side.nextDouble();
        System.out.print("Enter side (b): ");
        b = side.nextDouble();
        System.out.print("Enter side (c): ");
        c = side.nextDouble();

        //a + b > cb + c > aa + c > b

        //v = a + b;
        //u = c * b + c;
        //j = a * a + c;

        v = a + b;
        u = a + c;
        j = b + c;

        if (a == b && b == c )
            System.out.println("Triangle is equilateral");
        else if (a == 0 || b == 0 || c == 0)
            System.out.println("Triangle is not exist");
        else if ((a == b || a == c || b == c) && ( v > a && u > a && j > a && v > b && u > b && j > b && v > c && u > c && j > c)) {
            System.out.println("Triangle is isosceles");

            x1 = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c));
            angle1 = Math.toDegrees(x1);

            x2 = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
            angle2 = Math.toDegrees(x2);

            x3 = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
            angle3 = Math.toDegrees(x3);

            System.out.println("Angle (c): " + Math.floor(angle1));
            System.out.println("Angle (b): " + Math.floor(angle2));
            System.out.println("Angle (a): " + Math.floor(angle3));

        }else if ( v > a && u > a && j > a && v > b && u > b && j > b && v > c && u > c && j > c ) {
            x1 = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c));
            angle1 = Math.toDegrees(x1);

            x2 = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
            angle2 = Math.toDegrees(x2);

            x3 = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
            angle3 = Math.toDegrees(x3);

            System.out.println("Angle (c): " + Math.floor(angle1));
            System.out.println("Angle (b): " + Math.floor(angle2));
            System.out.println("Angle (a): " + Math.floor(angle3));
        }else
            System.out.println("Triangle is not exist");

        if (Math.floor(angle1) == 90)
            System.out.println("Triangle is right-angled");
        else if (Math.floor(angle2) == 90)
            System.out.println("Triangle is right-angled");
        else if (Math.floor(angle3) == 90)
            System.out.println("Triangle is right-angled");
        else if (Math.floor(angle1) < 90 && Math.floor(angle2) < 90 && Math.floor(angle3) < 90)
            System.out.println("Triangle is acute-angled");
        else if (Math.floor(angle1) > 90 || Math.floor(angle2) > 90 || Math.floor(angle3) > 90)
            System.out.println("Triangle is acute-angled");
        }
    }

