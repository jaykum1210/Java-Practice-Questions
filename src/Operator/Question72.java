package Operator;

import java.util.Scanner;

public class Question72 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount : ");
        int a = sc.nextInt();
        float amount = 0;
        if(a>=1000){
            amount = a - ((a*0.2f));
        }
        System.out.println("Amount : " + amount);
    }
}
