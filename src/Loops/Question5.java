package Loops;

import java.util.Scanner;

public class Question5 {
    //Even Numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for (int i = 2;i<=a;i+=2){
            System.out.println(i);
        }
    }
}
