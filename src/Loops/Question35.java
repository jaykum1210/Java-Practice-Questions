package Loops;

import java.util.Scanner;

public class Question35 {
    //Emirp Number
    public static boolean PrimeNumbers(int a){
        for (int i = a/2;i>1;i--){
            if (a%i==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        if (PrimeNumbers(a)){
            System.out.println("Not a Prime Number");
            return;
        }
        int rev = 0;
        while (a>0){
            int b = a%10;
            rev = rev*10 + b;
            a/=10;
        }
        if (PrimeNumbers(rev)){
            System.out.println("Not a Emirp Number");
            return;
        }
        System.out.println("Emirp Number");
    }
}
