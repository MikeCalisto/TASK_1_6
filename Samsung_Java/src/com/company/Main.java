package com.company;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            // * Primitive Data Types *

        System.out.println("Primitive Data Types : ");
        byte num_1 = 34;   //from -128 to 127
        short num_2 = -24655;   //from -32768 to 32767
        int num_3 = 56765;   //from -2^31 to 2^63-1
        long num_4 = 56567964;   //from -2^63 to 2^64-1
        float num_5 = 23.45f;   //floating point
        double num_6 = 242.6742;   //floating point
        boolean num_7 = true;   //only 0(false) or 1(true)
        char num_8 = 'R';  //only letters ot number
        String num_9 = "Good Afternoon, Sam!!!";   //text

        System.out.println("byte :" + num_1);
        System.out.println("short : " + num_2);
        System.out.println("int : " + num_3);
        System.out.println("long : " + num_4);
        System.out.println("float : " + num_5);
        System.out.println("double : " + num_6);
        System.out.println("boolean : " + num_7);
        System.out.println("char : " + num_8);
        System.out.println("String : " + num_9);


        // * явное и не явное преобразование типов *

        System.out.println("явное и не явное преобразование типов : ");

        int a = 0;
        long b = 15;
        a = (int) b;               // from long to int
        System.out.println(a);

        byte a1 = 0;
        int b1 = 16;
        a1 = (byte) b1;               // from int to byte
        System.out.println(a1);

        long a2 = 0;
        double b2 = 17.2638d;
        a2 = (long) b2;               // from double to long
        System.out.println(a2);

        int a3 = 0;
        char b3 = 'S';
        a3 = (int) b3;               // from char to int
        System.out.println(a3);

        double a4 = 128;
        byte b4 = (byte)a4;
        System.out.println(b4);

        float a5 = 567538545546578.789f;
        int b5 = (int)a5;
        System.out.println(b5);

        char a6 = 'G';
        int b6 = (int)a6;
        System.out.println(b6);

        char a7 = 'G';
        byte b7 = (byte)a7;
        System.out.println(b7);

        char a8 = 'G';
        short b8 = (short)a8;
        System.out.println(b8);


            // * Mathematical formulas *

        Scanner num = new Scanner(System.in);
        float first, second, result;
        System.out.print("Enter first num : ");
        first = num.nextFloat();
        System.out.print("Enter second num : ");
        second = num.nextFloat();
        result = first + second;
        System.out.println("Sum is : " + result);

        float first_2, second_2, result_2;
        System.out.print("Enter first num : ");
        first_2 = num.nextFloat();
        System.out.print("Enter second num : ");
        second_2 = num.nextFloat();
        result_2 = first_2 - second_2;
        System.out.println("Difference is : " + result_2);

        float first_3, second_3, result_3, result_3_1;
        System.out.print("Enter first num : ");
        first_3 = num.nextFloat();
        System.out.print("Enter second num : ");
        second_3 = num.nextFloat();
        result_3 = first_3 * second_3;
        result_3_1 = first_3 / second_3;
        System.out.println("Product is : " + result_3);
        System.out.println("Part is : " + result_3_1);

        float first_4, second_4, result_4;
        System.out.print("Enter first num : ");
        first_4 = num.nextFloat();
        System.out.print("Enter second num : ");
        second_4 = num.nextFloat();
        result_4 = first_4 % second_4;
        System.out.println("Remainder is : " + result_4);

        float first_5, second_5, result_5;
        System.out.print("Enter first num : ");
        first_5 = num.nextFloat();
        System.out.print("Enter second num : ");
        second_5 = num.nextFloat();
        result_5 = first_5 + second_5;
        result_5++;
        System.out.println("Increment is : " + result_5);
        result_5 = first_5 + second_5;
        result_5--;
        System.out.println("Decrement is : " + result_5);



    }


}
