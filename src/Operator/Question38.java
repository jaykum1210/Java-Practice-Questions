package Operator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int count = 0;
        while(a>0){
            count+=(a&1);
            a = a>>1;
        }
        System.out.println("Count : " + count);
    }
}
