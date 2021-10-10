package javaprogramming;

public class Programme3 {
    int x = 20;// Instance variable
    static int c = 30;// Static variable

    public static void main(String[] args) {
        Programme3 obj = new Programme3();
        System.out.println(obj.x); //20
        //System.out.println(StaticVariables.c);//
        myMethod();//30
    }

    public void test() {
        // Instance area
        System.out.println(x);
        Programme3 obj = new Programme3();
    }

    public static void myMethod() {
        System.out.println(c);
    }
}
