package Operator;

import java.util.Scanner;

public class Question85 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        boolean c = false;
        while (a>0){
            int b = a%10;
            if (b==0){
                c = true;
                break;
            }
            a/=10;
        }
        System.out.println(c);
    }
}
