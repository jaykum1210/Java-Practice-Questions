package Loops;

import java.util.Scanner;

public class Question29 {
    //Sum of Alternating Digits
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int sum = 0;
        while (a>0){
            int b = a%10;
            sum+=b;
            a/=100;
        }
        System.out.println("Sum : " + sum);
    }
}
