package JavaBasics;

public class Question5 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);//20
        System.out.println(b);//10
    }
}
