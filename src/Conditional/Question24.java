package Conditional;

import jdk.dynalink.NamedOperation;

import java.util.Scanner;

public class Question24 {
    //AMT Daily Limit
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount : ");
        int a = sc.nextInt();
        if (a>10000){
            System.out.println("Limit Reached");
        }
        else{
            System.out.println("Withdrawal");
        }
    }
}
