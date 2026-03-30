package Basics;

import java.util.Scanner;

public class Question12 {
    //Leap Year
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int a = sc.nextInt();
        if ((a%4==0 && a%100!=0) || a%400==0){
            System.out.println("Lear Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
