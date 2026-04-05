package Loops;

import java.util.Scanner;

public class Question44 {
    //count Bits
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int one = 0;
        int zero = 0;
        while (a>0){
            int b = a%2;
            if (b==1) one++;
            else zero++;
            a/=2;
        }
        System.out.println("Number of 1 : " + one);
        System.out.println("Number of 0 : " + zero);
    }
}
