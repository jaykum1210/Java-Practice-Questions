package Operator;

import java.util.Scanner;

public class Question41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int a = sc.nextInt();
        System.out.println(a>90?'A':a>75?'B':a>60?'C':a>45?'D':a>33?'E':'F');
    }
}
