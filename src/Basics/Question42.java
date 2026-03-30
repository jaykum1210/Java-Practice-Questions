package Basics;

import java.util.Scanner;

public class Question42 {
    // Max by ternary operator
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = a>b?a:b;
        System.out.println("Maximum Number : " + max);
    }
}
