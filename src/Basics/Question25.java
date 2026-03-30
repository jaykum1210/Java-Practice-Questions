package Basics;

import java.util.Scanner;

public class Question25 {
    //Amount After Discount
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price : ");
        int p = sc.nextInt();
        System.out.println("Enter Discount percentage : ");
        int d = sc.nextInt();
        double amount = p - (double)(d*p)/100;
        System.out.println("Amount : " + amount);
    }
}
