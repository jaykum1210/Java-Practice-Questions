package Basics;

import java.util.Scanner;

public class Question48 {
    //Sum of 5 Numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Five Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.println("Sum : " + (a+b+c+d+e));
    }
}
