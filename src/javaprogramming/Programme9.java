package javaprogramming;

import java.util.Locale;
import java.util.Scanner;

public class Programme9 {
    private static Scanner sc;

    public static void main(String[] args) {
        Programme9 obj = new Programme9();
        obj.upper();


    }

    public void upper() {
        String UpperStr;

        sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("\n Enter Uppercase String =");
        UpperStr = sc.nextLine();
        String UpperStr1 = UpperStr.toLowerCase();
        System.out.println("\n The Lowercase String =" + UpperStr1);
    }

}
