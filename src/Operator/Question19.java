package Operator;

import java.util.Scanner;

public class Question19 {
    // Even Odd By Ternary
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((a%2==0)?"Even":"Odd");
    }
}
