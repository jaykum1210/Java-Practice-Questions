package Loops;

import java.util.Scanner;

public class Question43 {
    //Reverse Bit
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int rev = 0;
        int i = 0;
        while (a>0){
            int b = a%2;
            rev = rev*2 + b;
            a/=2;
        }
        System.out.println("Reverse Bit : " + rev);
    }
}
