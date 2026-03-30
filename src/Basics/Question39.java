package Basics;

import java.util.Scanner;

public class Question39 {
    // Salary with Bonus
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        int a = sc.nextInt();;
        System.out.println("Salary : " + (a + (float)(a*0.1)));
    }
}
