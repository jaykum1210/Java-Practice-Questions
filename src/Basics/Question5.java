package Basics;

import java.util.Scanner;

public class Question5 {
    // Even Odd
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println(a + " is even");
        }
        else{
            System.out.println(a + " is odd");
        }
    }
}
