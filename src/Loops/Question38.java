package Loops;

import java.util.Scanner;

public class Question38 {
    //Digit Frequency Maximum
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int max = 0;
        int maxnum = 0;
        while (a>0){
            int b = a%10;
            int count = 0;
            int num = a;
            while (num>0){
                int c = num%10;
                if (b==c){
                    count++;
                }
                num/=10;
            }
            if (count>max){
                max = count;
                maxnum = b;
            }
            a/=10;
        }
        System.out.println("Maximum Digit : " + maxnum);
    }
}
