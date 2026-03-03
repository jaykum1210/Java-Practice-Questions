package Operator;

import java.util.Scanner;

public class Question26 {
    // Maximum number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int c = sc.nextInt();
        int max = (a>b && a>c)?a:(b>a && b>c)?b:c;
        System.out.println("Maximum Number : " + max);
    }
}
