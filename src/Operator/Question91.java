package Operator;

import java.util.Scanner;

public class Question91 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Sides : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)){
            System.out.println("true");
        }
        else{
            System.out.println("flase");
        }
    }
}
