package Loops;

import java.util.Scanner;

public class Question36 {
    //Largest Prime Factor
    public static boolean PrimeNum1(int a){
        for (int i = a/2;i>1;i--){
            if (a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        if (PrimeNum1(a)){
            System.out.println(a);
            return;
        }
        for (int i = a/2;i>1;i--){
            if (a%i==0){
                if (PrimeNum1(i)){
                    System.out.println(i);
                    return;
                }
            }
        }

    }
}
