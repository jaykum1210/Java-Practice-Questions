package Conditional;

import java.util.Scanner;

public class Question34 {
    //Hotel Booking
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Member : ");
        int a = sc.nextInt();
        System.out.println("Season : ");
        boolean b = sc.nextBoolean();
        int fair = 0;
        if (b){
            fair = a*2500;
        }
        else{
            fair = a*2000;
        }
        System.out.println("Price : " + fair);
    }
}
