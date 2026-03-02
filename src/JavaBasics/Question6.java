package JavaBasics;

public class Question6 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        a = (a+b);
        b = (a-b);
        a = (a-b);
        System.out.println(a);//20
        System.out.println(b);//10
    }
}
