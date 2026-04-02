package Loops;

import java.util.Scanner;

public class Question12 {
    //Fibonacci Series
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int first = 0;
        int sec = 1;
        int sum = 0;
        for (int i = 0;i<a;i++){
            if (i==0){
                System.out.println(first);
            } else if (i==1) {
                System.out.println(sec);
            }
            else{
                sum = first + sec;
                first = sec;
                sec = sum;
                System.out.println(sum);
            }
        }
    }
}
