package javaprogramming;

import java.util.Scanner;

public class Programme5 {
    //A Java programme for a calculator with addition,subtraction,multiplication and division.
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = myobj.nextInt();
        System.out.println("Enter second number");
        int b = myobj.nextInt();
        //int answer = 0;
        Programme5 obj = new Programme5();
        obj.addition(a, b);
        obj.sub(a, b);
        multi(a, b);
        divide(a, b);


    }

    public void addition(int a, int b) {
        System.out.println(a + b);


    }

    public void sub(int a, int b) {
        System.out.println(a - b);


    }

    public static void multi(int a, int b) {
        System.out.println(a * b);


    }

    public static void divide(int a, int b) {
        System.out.println(a / b);


    }
}
