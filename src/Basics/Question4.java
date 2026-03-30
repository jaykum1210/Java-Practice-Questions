package Basics;

import java.util.Scanner;

public class Question4 {
    // Simple Interest
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle : ");
        int p = sc.nextInt();
        System.out.println("Enter Rate : ");
        int r = sc.nextInt();
        System.out.println("Enter Time : ");
        int t = sc.nextInt();
        float si = (float)(p*r*t)/100;
        System.out.println("Simple Interest : " + si);
    }
}
