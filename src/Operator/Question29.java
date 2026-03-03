package Operator;

import java.util.Scanner;

public class Question29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println((a%3==0) || (a%7==0));
    }
}
