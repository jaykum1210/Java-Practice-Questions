package Operator;

import java.util.Scanner;

public class Question53 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        int a = sc.nextInt();
        float amount;
        if(a<20000){
            amount = a + (float)(a*0.1f);
        }
        else{
            amount = a;
        }
        System.out.println("Amount : " + amount);
    }
}
