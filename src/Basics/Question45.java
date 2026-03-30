package Basics;

import java.util.Scanner;

public class Question45 {
    // rupee to dollar
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rupee : " );
        int a = sc.nextInt();
        int dollar = a/94;
        int cent = a%94;
        System.out.println(dollar+"dollar " + cent + "cent");
    }
}
