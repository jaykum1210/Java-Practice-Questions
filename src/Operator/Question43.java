package Operator;

import java.util.Scanner;

public class Question43 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int a = sc.nextInt();
        System.out.println(a>=40?"Pass":"Fail");
    }
}
