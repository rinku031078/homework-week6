package javaprogramming;

import java.util.Scanner;

//A Java programme for a calculator with addition,subtraction,multiplication and division.
public class Calculator1 {
    public static void main(String[] args) {

        Calculator1 obj = new Calculator1();
        obj.calc();
    }

    public void calc() {
        Scanner in = new Scanner(System.in);
        double fnum, snum, answer, answer1, answer2, answer3;
        System.out.println("Enter first num:");
        fnum = in.nextDouble();
        System.out.println("Enter second num:");
        snum = in.nextDouble();
        answer = fnum + snum;
        answer1 = fnum - snum;
        answer2 = fnum * snum;
        answer3 = fnum / snum;
        System.out.println(answer);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
    }


}
