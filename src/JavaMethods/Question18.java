package JavaMethods;

import java.util.Scanner;

public class Question18 {
    //Nth Fibonacci Number
    int fib(int pos){
        if (pos == 0) return 0;
        else if (pos==1) {
            return 1;
        }
        return fib(pos-1) + fib(pos-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question18 q = new Question18();
        System.out.println("Enter Position : ");
        int pos = sc.nextByte();
        int num = q.fib(pos);
        System.out.println(pos + "th Position of Fibonacci Series : " + num);
    }
}
