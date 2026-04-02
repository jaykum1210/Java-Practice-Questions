package Loops;

import java.util.Scanner;

public class Question17 {
    //Perfect Number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1;i<=a/2;i++){
            if (a%i==0){
                sum+=i;
            }
        }
        if (sum==a){
            System.out.println("Perfect");
        }
        else{
            System.out.println("Not A Perfect");
        }
    }
}
