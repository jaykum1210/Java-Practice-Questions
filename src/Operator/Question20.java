package Operator;

import java.util.Scanner;

public class Question20 {
    // Maximum Value
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        int c = (a>b)?a:b;
        System.out.print("Max : " + c);
    }
}
