package Operator;

import java.util.Scanner;

public class Question71 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Unit : ");
        int a = sc.nextInt();
        System.out.println((a>=500)?a*7:(a>=200)?a*6:(a>=100)?a*5:a*4);
    }
}
