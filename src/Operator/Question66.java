package Operator;

import java.util.Scanner;

public class Question66 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Sides of Triangle : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b>c && b+c > a && a+c>b){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }
    }
}
