package Conditional;

import java.util.Scanner;

public class Question10 {
    //Subscription Plan
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter GB Plan : ");
        int a = sc.nextInt();
        System.out.println("Paid??(true/false) : ");
        boolean p = sc.nextBoolean();
        if (a>=100 && p){
            System.out.println("Premium");
        } else if (a >= 50) {
            System.out.println("Standard");
        }
        else{
            System.out.println("Basic");
        }
    }
}
