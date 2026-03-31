package Conditional;

import java.util.Scanner;

public class Question7 {
    // Loan
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        int a = sc.nextInt();
        System.out.println("Enter Credit Score : ");
        int b = sc.nextInt();
        if (a>=25000 && b>=700){
            System.out.println("Approved");
        }
        else {
            System.out.println("Rejected");
        }
    }
}
