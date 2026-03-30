package Basics;

import java.util.Scanner;

public class Question41 {
    // Rectangle perimeter
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sides : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Perimeter : " + (2*(a+b)));
    }
}
