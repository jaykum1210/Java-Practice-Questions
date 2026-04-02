package Conditional;

import java.util.Scanner;

public class Question48 {
    // Smart Parking
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Slot Available?? : ");
        boolean a = sc.nextBoolean();
        System.out.println("Enter Vehicle : ");
        String b = sc.next();
        b = b.toLowerCase();
        if (a && b.equals("car")){
            System.out.println("Allowed");
        }
        else{
            System.out.println("Not Allowed");
        }
    }
}
