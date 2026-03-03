package Operator;

import java.util.Scanner;

public class Question59 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("First Number : " + a);
        System.out.println("Second Number : " + b);
    }
}
