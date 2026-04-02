package Loops;

import java.util.Scanner;

public class Question15 {
    //Count Divisor
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int count = 2;
        for (int i = 2;i<=a/2;i++){
            if (a%i==0){
                count++;
            }
        }
        System.out.println("Divisor : " + count);
    }
}
