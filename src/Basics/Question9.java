package Basics;

import java.util.Scanner;

public class Question9 {
    // ASCII Value
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character : ");
        char a = sc.next().charAt(0);
        System.out.println("ASCII value of " + a + " = " + (int)a);
    }
}
