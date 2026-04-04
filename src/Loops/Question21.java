package Loops;

import java.util.Scanner;

public class Question21 {
    //Count Prime Numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int count = 0;
        for (int i = 2;i<=a;i++){
            boolean flag = true;
            for (int j = i-1;j>1;j--){
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                count++;
            }
        }
        System.out.println("Number Of Prime Numbers : " + count);
    }
}
