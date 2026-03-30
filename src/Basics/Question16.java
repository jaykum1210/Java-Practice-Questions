package Basics;

import java.util.Scanner;

public class Question16 {
    //Average of three numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average : " + ((a+b+c)/3));
    }
}
