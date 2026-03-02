package Operator;

import java.util.Scanner;

public class Question18 {
    // Logical Not
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        System.out.println(!(a>10));
    }
}
