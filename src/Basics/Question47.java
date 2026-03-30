package Basics;

import java.util.Scanner;

public class Question47 {
    // Three Digit Number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int count = 0;
        while (a>0){
            count++;
            a/=10;
        }
        if (count==3){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
