package Conditional;

import java.util.Scanner;

public class Question40 {
    //Eligibility
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Four : ");
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        boolean c = sc.nextBoolean();
        boolean d = sc.nextBoolean();
        boolean x = (a&&b)|| (c&&d);
        if (x){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }
    }
}
