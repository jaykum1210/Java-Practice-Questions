package OOPS;

class Calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
public class Question9 {
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println("Add of two Numbers : " + c.add(10,20));
        System.out.println("Add of three Numbers : " + c.add(10,20,30));
    }
}
