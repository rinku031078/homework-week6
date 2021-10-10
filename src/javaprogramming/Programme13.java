package javaprogramming;

import java.util.Scanner;

public class Programme13 {
    // Print the average of three numbers.
    public static void main(String[] args) {

        Programme13 obj = new Programme13();
        obj.average();
    }
    public void average(){
        Scanner in = new Scanner(System.in);


        System.out.println(" Input first number");
        float n1 = in.nextInt();
        System.out.println(" Input second number");
        float n2 = in.nextInt();
        System.out.println(" Input third number");
        float n3 = in.nextInt();

        System.out.println("Average of the Three number is:" + (n1 + n2 + n3) / 3);
    }


}

