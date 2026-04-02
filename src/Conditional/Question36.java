package Conditional;

import java.util.Scanner;

public class Question36 {
    // CashBack
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price : ");
        int a = sc.nextInt();
        System.out.println("Price : " + (a-a*0.1f));
    }
}
