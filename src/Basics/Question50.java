package Basics;

import java.util.Scanner;

public class Question50 {
    //Expression
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Expression : " + ((a+b)*(a-b)));
    }
}
