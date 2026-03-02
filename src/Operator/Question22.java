package Operator;

import java.util.Scanner;

public class Question22 {
    //Swap without Third Variable
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("A : " + a);
        System.out.println("B : " + b);
    }
}
