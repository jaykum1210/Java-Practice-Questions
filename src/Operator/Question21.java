package Operator;

import java.util.Scanner;

public class Question21 {
    // Simple Interest
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        int a = sc.nextInt();
        System.out.print("Enter Rate : ");
        int b = sc.nextInt();
        System.out.print("Enter Year : ");
        int c = sc.nextInt();
        float d = (float)(a*b*c)/100;
        System.out.print("Simple Interest : " + d);
    }
}
