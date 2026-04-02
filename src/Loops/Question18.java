package Loops;

import java.util.Scanner;

public class Question18 {
    //GCD of Numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = a;
        int max = b;
        if (b<min){
            min = b;
            max = a;
        }
        for (int i = min/2;i>=2;i--){
            if (min%i==0 && max%i==0){
                System.out.println("GCD : " + i);
                return;
            }
        }
        if (max%min==0){
            System.out.println("GCD : " + min);
        }
        else{
            System.out.println("GCD : " + 1);
        }
    }
}
