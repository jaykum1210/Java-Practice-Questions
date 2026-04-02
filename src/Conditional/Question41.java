package Conditional;

import java.util.Scanner;

public class Question41 {
    // Calculator
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Operation : ");
        char o = sc.next().charAt(0);
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int val = 0;
        switch (o){
            case '+':
                val = a+b;
                break;

            case '-':
                val = a-b;
                break;
            case '*':
                val = a*b;
                break;
            case '/':
                val = a/b;
                break;
            case '%':
                val = a%b;
                break;
        }
        System.out.println("Value : " + val);
    }
}
