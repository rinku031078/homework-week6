package javaprogramming;

import java.util.Locale;

// A Java Programme to convert a given string to lowercase
public class Programme19 {
    public static void main(String[] args) {
        Programme19 obj = new Programme19();
        obj.convert();
    }

    public void convert() {
        String s1 = new String("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.");
        // Convert To Lowercase
        System.out.println(s1.toLowerCase(Locale.ROOT));
    }
}
