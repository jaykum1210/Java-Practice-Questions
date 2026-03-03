package Operator;

import java.util.Scanner;

public class Question65 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Marks : ");
            int a = sc.nextInt();
            if (a>=75){
                System.out.println("Pass");
            }
            else{
                System.out.println("Fail");
            }
        }
}
