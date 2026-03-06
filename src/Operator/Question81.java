package Operator;

import java.util.Scanner;

public class Question81 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println(a==((a*a)%10));
    }
}
