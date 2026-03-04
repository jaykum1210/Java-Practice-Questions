package Operator;

import java.util.Scanner;

public class Question67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if (b > a && b > c) {
            max = b;
        } else if (c>a && c>b) {
            max = c;
        }
        System.out.println("Maximum : " + max);
    }
}
