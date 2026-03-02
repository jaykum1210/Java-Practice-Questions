package Operator;

import java.util.Scanner;

public class Question16 {
    // Logical And Question
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        System.out.println((a>10) && (a<50));
    }
}
