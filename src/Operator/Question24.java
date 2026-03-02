package Operator;

import java.util.Scanner;

public class Question24 {
    // Reverse Number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        int rev = 0;
        while(a>0){
            int b = a%10;
            rev = rev*10 + b;
            a/=10;
        }
        System.out.println("Reverse Number : " + rev);
    }
}
