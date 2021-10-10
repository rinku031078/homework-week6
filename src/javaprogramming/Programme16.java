package javaprogramming;

import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {
        Programme16 obj = new Programme16();
        obj.binary();
    }

    public void binary() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first binary number :");//1
        String x = in.next();
        System.out.println("Input second binary number:");//0
        String y = in.next();

        int n1 = Integer.parseInt(x, 2);
        int n2 = Integer.parseInt(y, 2);
        int n3 = n1 + n2;

        System.out.println("Sum of two  binary number:" + Integer.toBinaryString(n3));//101

    }
}
