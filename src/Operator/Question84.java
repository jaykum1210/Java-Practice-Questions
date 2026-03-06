package Operator;

import java.util.Scanner;

public class Question84 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int sum = 0;
        int pro = 1;
        while (a>0){
            int b = a%10;
            sum+=b;
            pro*=b;
            a/=10;
        }
        System.out.println(sum==pro);
    }
}
