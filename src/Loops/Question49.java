package Loops;

import java.util.Scanner;

public class Question49 {
    // Check Kaprekar number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        int ori = a;
        int sq = a * a;
        int length = 0;
        int temp = a;
        while (temp > 0){
            length++;
            temp /= 10;
        }
        int divisor = (int)Math.pow(10, length);
        int right = sq % divisor;
        int left = sq / divisor;
        int sum = left + right;
        System.out.println("Left : " + left);
        System.out.println("Right : " + right);
        if (sum == ori){
            System.out.println("Kaprekar Number");
        }
        else{
            System.out.println("Not a Kaprekar Number");
        }
    }
}