package Basics;

import java.util.Scanner;

public class Question10 {
    // Convert Double to Int
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Double Value :");
        double a = sc.nextDouble();
        int b = (int)a;
        System.out.println("Integer : " + b);
    }
}
