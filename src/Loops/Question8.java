package Loops;

import java.util.Scanner;

public class Question8 {
    //Count Digit
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int count = 0;
        while (a>0){
            count++;
            a/=10;
        }
        System.out.println("Digit : " + count);
    }
}
