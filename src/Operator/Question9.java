package Operator;

import java.util.Scanner;

public class Question9 {
    // Using "--" to decrement value
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        System.out.println("Decrement Value : " + --a);
    }
}
