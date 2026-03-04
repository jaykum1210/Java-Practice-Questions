package Operator;

import java.util.Scanner;

public class Question68 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int a = sc.nextInt();
        if(a>=60){
            System.out.println("Senior");
        }
        else if (a>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Child");
        }
    }
}
