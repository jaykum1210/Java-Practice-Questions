package Conditional;

import java.util.Scanner;

public class Question43 {
    // Delivery Charge
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price : ");
        int a = sc.nextInt();
        int charge = a;
        if (a<500){
            charge+=50;
        }
        System.out.println("Total Price : " + charge);
    }
}
