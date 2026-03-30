package Basics;

import java.util.Scanner;

public class Question37 {
    // char to int
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character : ");
        char c = sc.next().charAt(0);
        System.out.println("Number : " + (c - '0'));
    }
}
