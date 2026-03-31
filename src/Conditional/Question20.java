package Conditional;

import java.util.Scanner;

public class Question20 {
    //BMI Category
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BMI : ");
        float a = sc.nextFloat();
        if (a<18.5){
            System.out.println("Underweight");
        } else if (a < 25) {
            System.out.println("Normal");
        }
        else{
            System.out.println("Overweight");
        }
    }
}
