package Operator;

import java.util.Scanner;

public class Question30 {
    // Percentage of 5 subjects
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0 , i = 0;
        while(i<5){
            System.out.println("Enter Marks of " + (i+1) + " subject : ");
            int marks = sc.nextInt();
            sum+=marks;
            i++;
        }
        float percentage = (float)sum/5;
        System.out.println("Percentage : " + percentage);
    }
}
