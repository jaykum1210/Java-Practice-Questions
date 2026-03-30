package Basics;

import java.util.Scanner;

public class Question21 {
    //Sum of digits
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int sum = 0;
        while (a>0){
            int b = a%10;
            sum+=b;
            a/=10;
        }
        System.out.println("Sum : " + sum);
    }
}
