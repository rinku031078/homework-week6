package javaprogramming;

import java.util.Scanner;
// A Java programme for a calculator with addition, subtraction, multiplication and division method.
public class Calculator {
    public static void main(String[] args) {

        Calculator obj = new Calculator();
        obj.cal();
        Calculator obj1 = new Calculator();
        obj.cal1();
        cal2();
        cal3();
    }

    public void cal() {
        //Instance method
        Scanner in = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first num:");
        fnum = in.nextDouble();
        System.out.println("Enter second num:");
        snum = in.nextDouble();
        answer = fnum + snum;

        System.out.println(" Result will be display in adition = " + answer);

    }

    public void cal1() {
        //Instance method
        Scanner in = new Scanner(System.in);
        double fnum, snum, answer1;
        System.out.println("Enter first num:");
        fnum = in.nextDouble();
        System.out.println("Enter second num:");
        snum = in.nextDouble();
        answer1 = fnum - snum;
        System.out.println(" Result will be display in subtraction = " + answer1);

    }

    public static void cal2() {
        //Static method
        Scanner in = new Scanner(System.in);
        double fnum, snum, answer2;
        System.out.println("Enter first num:");
        fnum = in.nextDouble();
        System.out.println("Enter second num:");
        snum = in.nextDouble();
        answer2 = fnum * snum;
        System.out.println(" Result will be display in multiplication = " + answer2);


    }

    public static void cal3() {
        //Static method
        Scanner in = new Scanner(System.in);
        double fnum, snum, answer3;
        System.out.println("Enter first num:");
        fnum = in.nextDouble();
        System.out.println("Enter second num:");
        snum = in.nextDouble();
        answer3 = fnum / snum;
        System.out.println(" Result will be display in multiplication = " + answer3);

    }
}