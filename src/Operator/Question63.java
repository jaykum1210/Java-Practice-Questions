package Operator;

import java.util.Scanner;

public class Question63 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        String b = (a<0)?"Negative":(a>0)?"Positive":"Zero";
        System.out.println(b);
    }
}
