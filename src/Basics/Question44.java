package Basics;

import java.util.Scanner;

public class Question44 {
    //Check Range
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        if (a<=100 && a>=1){
            System.out.println("Valid");
        }
        else{
            System.out.println("Noy Valid");
        }
    }
}
