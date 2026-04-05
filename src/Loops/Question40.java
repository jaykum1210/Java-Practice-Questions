package Loops;

import java.util.Scanner;

public class Question40 {
    //Self Dividing Number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int temp = a;
        while (a>0){
            int b = a%10;
            if (temp%b!=0){
                System.out.println("No");
                return;
            }
            a/=10;
        }
        System.out.println("Yes");
    }
}
