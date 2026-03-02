package Operator;

import java.util.Scanner;

public class Question1 {
    //Add two Numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Sum : " + (a+b));
    }
}
