package Basics;

import java.util.Scanner;

public class Question7 {
    // Largest Three Numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println(a + " is greatest");
        } else if (b > c && b > a) {
            System.out.println(b + " is greatest");
        }
        else{
            System.out.println(c + " is greatest");
        }
    }
}
