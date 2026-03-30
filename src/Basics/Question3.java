package Basics;

import java.util.Scanner;

public class Question3 {
    // Area Of circle
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        int a = sc.nextInt();
        float area = 3.14f*a*a;
        System.out.println("Area : " + area);
    }
}
