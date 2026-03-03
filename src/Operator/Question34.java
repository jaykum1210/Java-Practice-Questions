package Operator;

import java.util.Scanner;

public class Question34 {
    //bitwise complement
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println(~a);
    }
}
