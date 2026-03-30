package Basics;

import java.util.Scanner;

public class Question34 {
    // Right Shift
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Number of times Shift : ");
        int b =  sc.nextInt();
        System.out.println("Right Shift : " + (a>>b));
    }
}
