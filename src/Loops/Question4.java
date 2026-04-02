package Loops;

import java.util.Scanner;

public class Question4 {
    //Table
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for (int i = 1;i<=10;i++){
            System.out.println(a+" X " + i + " = " + (a*i));
        }
    }
}
