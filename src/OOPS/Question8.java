package OOPS;

class MathUtils{
    int n;
    public static int square(int n){
        return n*n;
    }
}

public class Question8 {
    public static void main(String[] args){
        System.out.println("Square : " + MathUtils.square(6));
    }
}
