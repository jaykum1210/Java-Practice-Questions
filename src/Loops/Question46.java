package Loops;

import java.util.Scanner;

public class Question46 {
    //Sum of Digits from 1 to N(in single Digits)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1;i<=a;i++){
            int digit = i;
            if (i>9){
                digit = i/10 + i%10;
            }
            sum+=digit;
        }
        System.out.println("Sum : " + sum);
    }
}
