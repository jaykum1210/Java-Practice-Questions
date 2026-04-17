package JavaMethods;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Question2 {
    //Even/Odd
    public static String EvenOdd(int a){
        if (a%2==0) return "Even";
        return "Odd";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println(EvenOdd(a));
    }
}
