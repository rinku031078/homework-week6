package javaprogramming;

public class Programme4 {
    int x = 20;// Instance variable
    int y = 10;//second Instance variable
    static int c = 30;// Static variable
    static int f = 20;// second static variable

    public static void main(String[] args) {
        // Call both Instance and Static variables
        javaprogramming.Programme4 obj = new javaprogramming.Programme4();
        javaprogramming.Programme4 obj1 = new javaprogramming.Programme4();
        System.out.println(obj.x); //20
        System.out.println(obj.y); //10

        myMethod();//30 and 20
    }

    public void test() {
        // Instance area
        System.out.println(x);
        System.out.println(y);
    }

    public static void myMethod() {
        System.out.println(c);
        System.out.println(f);
    }
}
