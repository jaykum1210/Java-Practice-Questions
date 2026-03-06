package Operator;

import java.util.Scanner;

public class Question82 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int sum = 0;
        int ori = a;
        while (ori>0){
            int b = ori%10;
            sum+=b;
            ori/=10;
        }
        System.out.println((a%sum)==0);
    }
}
