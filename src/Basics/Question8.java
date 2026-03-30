package Basics;

import java.util.Scanner;

public class Question8 {
    // Convert Celsius to Fahrenheit
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature(C) : ");
        int c = sc.nextInt();
        float f = (float)(c*9.0/5)+32;
        System.out.println("Temperature in Fahrenheit : " + f);
    }
}
