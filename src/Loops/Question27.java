package Loops;

import java.util.Scanner;

public class Question27 {
    //Count Frequency
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Digit : ");
        int b = sc.nextInt();
        int count = 0;
        while (a>0){
            int c = a%10;
            if (c == b) count++;
            a/=10;
        }
        System.out.println("Frequency : " + count);
    }
}
