package Operator;

import java.util.Scanner;

public class Question8 {
    // Using "++" to increment value
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        System.out.println("Incremented Value : " + ++a);
    }
}
