package Operator;

import java.util.Scanner;

public class Question78 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println((a&(1<<3))!=0);
    }
}
