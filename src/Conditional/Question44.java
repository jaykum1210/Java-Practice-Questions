package Conditional;

import java.util.Scanner;

public class Question44 {
    // Ride
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance : ");
        int a = sc.nextInt();
        System.out.println("Night : ");
        boolean b = sc.nextBoolean();
        System.out.println("Rain : ");
        boolean c = sc.nextBoolean();
        float total = 0;
        if (b && c){
            total = a*10 + a*.2f + a*0.1f;
        } else if (b){
            total = a*10 + a*0.2f;
        } else if (c){
            total = a*10 + a*0.1f;
        }
        else{
            total = a*10;
        }
        System.out.println("Total Fair : " + total);
    }
}
