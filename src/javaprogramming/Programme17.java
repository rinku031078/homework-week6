package javaprogramming;

import java.util.Scanner;

public class Programme17 {
// A Java programme to convert a decimal number to binary number
    public static void main(String[] args) {
        Programme17 obj = new Programme17();
        obj.decimal();

    }

    public void decimal() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a Decimal Number : 5 ");//5
        System.out.println("Binary number is ");
        System.out.println(Integer.toBinaryString(5));//101

    }
}
