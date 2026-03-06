package Operator;

import java.util.Scanner;

public class Question92 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mid;
        if((a>=b && a<=c) || (a<=b && a>=c)){
            mid = a;
        } else if ((b>=a && b<=c) || (b>=c && b<=a)){
            mid = b;
        }
        else{
            mid = c;
        }
        System.out.println(mid);
    }
}
