package javaprogramming;

public class Calculator2 {
    //A Java programme for a calculator with addition,subtraction,multiplication and division.
    public static void main(String[] args) {
      Calculator2 obj = new Calculator2();
      obj.addition(10,20);//30
      obj.sub(25,20);//5
       multi(5,5); //25
        divide(50, 5);//10


    }
    public void addition(int a, int b){
        System.out.println(a + b);
    }
    public void sub( int c, int d){
        System.out.println(c - d);
    }
    public static void multi(int e, int f){
        System.out.println(e * f);
    }
    public static void divide(int h, int i){
        System.out.println(h / i);
    }
}
