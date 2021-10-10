package javaprogramming;

public class Programme15 {
    public static void main(String[] args) {
        Programme15 obj = new Programme15();
        obj.swap();
    }

    public void swap(){
        int x, y, temp;
        x =15;
        y =27;
        System.out.println("Before swapping : x, y = "+x+","+ y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping : x, y = "+x+","+ y);

    }
}
