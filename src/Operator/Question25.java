package Operator;

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number  : ");
        int a = sc.nextInt();
        System.out.println((a%5==0 && a%11==0));
    }
}
