package Loops;

import java.util.Scanner;

public class Question13 {
    //Largest Digit
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int max = 0;
        while (a>0){
            int b = a%10;
            if (b>max) max = b;
            a/=10;
        }
        System.out.println("Maximum Digit : " + max);
    }
}
