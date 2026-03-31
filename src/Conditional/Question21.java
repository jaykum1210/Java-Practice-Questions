package Conditional;

import java.util.Scanner;

public class Question21 {
    //Multi-Slab Tax
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        int a = sc.nextInt();
        float tax = 0;
        if (a<=200000){
            tax = 0;
        } else if (a<=500000) {
            tax = a*0.1f;
        } else if (a <= 1000000) {
            tax = a*0.15f;
        }
        else {
            tax = a*0.2f;
        }
        System.out.println("Tax : " + tax);
    }
}
