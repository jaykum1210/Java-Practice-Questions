package Basics;

import java.util.Scanner;

public class Question17 {
    // quotient and remainder
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Quotient : " + a/b);
        System.out.println("Remainder : " + a%b);
    }
}
