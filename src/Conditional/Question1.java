package Conditional;

import java.util.Scanner;

public class Question1 {
    //Income Tax Calculation
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        int a = sc.nextInt();
        float tax = 0;
        if (a<=250000){
            tax = 0;
        }
        else if(a<=500000){
            tax = 0.05f*a;
        }
        else {
            tax = 0.2f*a;
        }
        System.out.println(tax + " Rupees Tax");
    }
}
