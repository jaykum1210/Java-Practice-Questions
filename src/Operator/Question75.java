package Operator;

import java.util.Scanner;

public class Question75 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature : ");
        int a = sc.nextInt();
        System.out.println(a>30?"Hot":"Normal");
    }
}
