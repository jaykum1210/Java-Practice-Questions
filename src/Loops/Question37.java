package Loops;

import java.util.Scanner;

public class Question37 {
    //Remove Duplicate Digits
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int num = 0;
        int i = 0;
        while (a>0){
            int b = a%10;
            int temp = num;
            boolean flag = true;
            while (temp>0){
                if (b == temp%10){
                    flag = false;
                    break;
                }
                temp/=10;
            }
            if (flag){
                num = b*(int)Math.pow(10,i++) + num;
            }
            a/=10;
        }
        System.out.println("Number : " + num);
    }
}
