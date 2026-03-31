package Conditional;

import java.util.Scanner;

public class Question23 {
    //E-commerce Offer
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount : ");
        int a = sc.nextInt();
        System.out.println("Cashback Online(true/false) : ");
        boolean on = sc.nextBoolean();
        float dis = 0;
        if (a>=5000 ){
            dis = a - (a*0.1f);
        }
        else{
            dis = a;
        }
        if (on){
            System.out.println("Discount : " + dis + " Online");
        }
        else{
            System.out.println("Discount : " + dis + " Cash");
        }
    }
}
