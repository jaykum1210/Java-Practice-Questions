package Conditional;

import java.util.Scanner;

public class Question4 {
    // ATM Withdrawal
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance : ");
        int a = sc.nextInt();
        System.out.println("Enter Withdrawal Money : ");
        int b = sc.nextInt();
        if (b<a && b%100==0){
            System.out.println("Transaction Successful");
        }
        else{
            System.out.println("Transaction Failed");
        }
    }
}
