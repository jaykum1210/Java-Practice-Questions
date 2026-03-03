package Operator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question54 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        a+=b;
        System.out.println("Sum : " + a);
    }
}
