package Basics;

import java.util.Scanner;

public class Question6 {
    // Largest Tow Numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a + " is Larger");
        }
        else if(b>a){
            System.out.println(b + " is Larger");
        }
        else{
            System.out.println("Both Are Equal");
        }
    }
}
