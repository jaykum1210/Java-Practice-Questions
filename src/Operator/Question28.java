package Operator;

import java.util.Scanner;

public class Question28 {
    // Leap Year
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int a = sc.nextInt();
        boolean b = ((a%400==0) ||(a%100!=0 && a%4==0));
        System.out.println("Leap Year : " + b);
    }
}
