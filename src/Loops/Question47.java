package Loops;

import java.util.Scanner;

public class Question47 {
    //Count Numbers Without Zeros
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int count = 0;
        for (int i = 1;i<=a;i++){
            boolean flag= true;
            int digit = i;
            while (digit>0){
                int b = digit%10;
                if (b == 0){
                    flag = false;
                    break;
                }
                digit/=10;
            }
            if (flag){
                count++;
            }
        }
        System.out.println("Numbers : " + count);
    }
}
