package Operator;

import java.util.Scanner;

public class Question83 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int b = a*a;
        int sum = 0;
        while (b>0){
            int c = b%10;
            sum+=c;
            b/=10;
        }
        System.out.println(sum==a);
    }
}
