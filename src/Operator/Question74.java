package Operator;

import java.util.Scanner;

public class Question74 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int b = (int)Math.sqrt(a);
        System.out.println((b*b== a));
    }
}
