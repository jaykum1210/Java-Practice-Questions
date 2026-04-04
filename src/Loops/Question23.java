package Loops;

import java.util.Scanner;

public class Question23 {
    //Digital Root
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int sum = 0;
        while (a>0){
            int b = a%10;
            sum+=b;
            if(sum>9){
                int x = sum;
                sum = x%10 + x/10;
            }
            a/=10;
        }
        System.out.println("Digital Sum : " + sum);
    }
}
