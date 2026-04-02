package Loops;

import java.util.Scanner;

public class Question3 {
    //Factorial
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int fact = 1;
        for (int i = 2;i<=a;i++){
            fact*=i;
        }
        System.out.println("Factorial : " + fact);
    }
}
