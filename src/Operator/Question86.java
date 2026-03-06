package Operator;

import java.util.Scanner;

public class Question86 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int c = sc.nextInt();
        int max = a;
        if(b>a && b>c){
            max = b;
        } else if (c>a && c>b) {
            max = c;
        }
        System.out.println("Maximum : " + max);
    }
}
