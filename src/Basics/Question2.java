package Basics;

import java.util.Scanner;

public class Question2 {
    //Swap Without Third Variable
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Two Numbers : " + a + " " + b);

    }
}
