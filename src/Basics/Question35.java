package Basics;

import java.util.Scanner;

public class Question35 {
    //Compund Interest
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal : ");
        int p = sc.nextInt();
        System.out.println("Enter Rate : ");
        int r = sc.nextInt();
        System.out.println("Enter Year : ");
        int t = sc.nextInt();
        double amount = p * Math.pow((1 + (r / 100.0)), t);
        System.out.println("Amount : " + amount);
    }
}
