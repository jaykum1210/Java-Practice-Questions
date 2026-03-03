package Operator;

import java.util.Scanner;

public class Question50 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int pro = 1;
        while (a>0){
            int b = a%10;
            pro*=b;
            a/=10;
        }
        System.out.println("Number : " + pro);
    }
}
