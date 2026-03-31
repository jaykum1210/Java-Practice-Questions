package Conditional;

import java.util.Scanner;

public class Question8 {
    // Ride Fare
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance : ");
        int a = sc.nextInt();
        System.out.println("Peak Time (true/false): ");
        boolean p = sc.nextBoolean();
        float fare = 0;
        if (p){
            fare = a*10 + (a*10)*0.2f;
        }
        else fare = a*10;
        System.out.println("Fare : " + fare);
    }
}
