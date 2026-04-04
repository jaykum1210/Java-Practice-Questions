package Loops;

import java.util.Scanner;

public class Question31 {
    //Next Prime Number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for (int i = ++a;;i++){
            boolean flag = true;
            for (int j = i/2;j>1;j--){
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Prime Number : " + i);
                return;
            }
        }
    }
}
