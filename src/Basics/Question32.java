package Basics;

import java.util.Scanner;

public class Question32 {
    // Bitwise XOR
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Bitwise XOR : " + (a^b));
    }
}
