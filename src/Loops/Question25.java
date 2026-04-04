package Loops;

import java.util.Scanner;

public class Question25 {
    // Binary To Decimal
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number : ");
        int a = sc.nextInt();
        int num = 0;
        int i = 0;
        while (a>0){
            int b = a%10;
            num+=(b*(int)Math.pow(2,i++));
            a/=10;
        }
        System.out.println("Number : " + num);
    }
}
