package Conditional;

import java.util.Scanner;

public class Question12 {
    //Ticket Pricing
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance : ");
        int a = sc.nextInt();
        int fair = 0;
        if (a<12){
            fair = 12;
        } else if (a < 60) {
            fair = 100;
        }
        else {
            fair = 70;
        }
        System.out.println("Fair : " + fair);
    }
}
