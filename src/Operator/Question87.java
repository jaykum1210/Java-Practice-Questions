package Operator;

import java.util.Scanner;

public class Question87 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        boolean c = true;
        while (a>=10){
            int b = a%10;
            a/=10;
            int d = a%10;
            if(b!=d){
                c = false;
                break;
            }
        }
        System.out.println(c);
    }
}
