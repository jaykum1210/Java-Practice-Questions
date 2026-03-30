package Basics;

import java.util.Scanner;

public class Question29 {
    // Pre And Post Increment
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println("Pre Increment : " + (++a));
        System.out.println("Post Increment : " + (a++));
    }
}
