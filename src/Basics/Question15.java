package Basics;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base : ");
        int b = sc.nextInt();
        System.out.println("Enter Power : ");
        int p = sc.nextInt();
        double po = Math.pow(b,p);
        System.out.println("Power : " + po);
    }
}
