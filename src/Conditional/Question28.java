package Conditional;

import java.util.Scanner;

public class Question28 {
    //Ride Fare
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance : ");
        int a = sc.nextInt();
        System.out.println("Enter Peak/Night/Day : ");
        String b = sc.next();
        b = b.toLowerCase();
        int fair = 0;
        if (b.equals("day") || b.equals("night") || b.equals("peak")){
            fair = a*10 + (a*2);
        }
        else{
            fair = a*10;
        }
        System.out.println("Fair : " + fair);
    }
}
