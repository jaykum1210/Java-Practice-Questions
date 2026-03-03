package Operator;

import java.util.Scanner;

public class Question39 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int b = a^(1<<1);
        System.out.println(b);
    }
}
