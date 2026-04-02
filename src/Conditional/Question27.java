package Conditional;

import java.util.Scanner;

public class Question27 {
    //Loan Risk
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        int a = sc.nextInt();
        System.out.println("Enter Credit Score : ");
        int b = sc.nextInt();
        if (a<25000 || b<725){
            System.out.println("Rejected");
        }
        else{
            System.out.println("Approved");
        }
    }
}
