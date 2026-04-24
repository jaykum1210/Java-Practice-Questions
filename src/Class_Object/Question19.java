package Class_Object;

class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

public class Question19 {
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        System.out.println("Sum : " + c1.sum(10,20));
        System.out.println("Sum : " + c2.sum(10,20,30));
    }
}
