package Loops;

import java.util.Scanner;

public class Question32 {
    //Twin Pairs of Prime Numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int first = 2;
        int sec = 3;
        for (int i = 4;i<=a;i++){
            boolean flag = true;
            for (int j = i-1;j>1;j--){
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                first = sec;
                sec = i;
                if (sec-first==2){
                    System.out.println(first + " " + sec);
                }
            }
        }
    }
}
