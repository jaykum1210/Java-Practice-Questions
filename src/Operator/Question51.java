package Operator;

import java.util.Scanner;

public class Question51 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println((a%2==0) && (a%3==0) && (a%5==0));
    }
}
