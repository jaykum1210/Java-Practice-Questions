package Loops;

import java.util.Scanner;

public class Question30 {
    //Trailing Zeros
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int count = 0;
        while (a>0){
            int b = a%10;
            if (b!=0){
                break;
            }
            count++;
            a/=10;
        }
        System.out.println("Count : " + count);
    }
}
