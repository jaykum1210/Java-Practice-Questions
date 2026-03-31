package Conditional;

import java.util.Scanner;

public class Question22 {
    //Smart Scholarship
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int m = sc.nextInt();
        System.out.println("Enter Income : ");
        int in = sc.nextInt();
        System.out.println("Enter Category : ");
        String ct = sc.next();
        System.out.println("Disabled(true/false) : ");
        boolean d = sc.nextBoolean();
        if (m>=75 && in<500000 && (ct.equals("st") || ct.equals("sc")) && d){
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not Eligible");
        }
    }
}
