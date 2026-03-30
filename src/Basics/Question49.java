package Basics;

import java.util.Scanner;

public class Question49 {
    // Type Promotion
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        float b = sc.nextFloat();
        System.out.println("Sum : " + (a+b));
    }
}
