package Basics;

import java.util.Scanner;

public class Question26 {
    // BMI Calculator
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight : ");
        int w = sc.nextInt();
        System.out.println("Enter Height : ");
        float h = sc.nextFloat();
        double bmi = w/(h*h);
        System.out.println("BMI : " + bmi);
    }
}
