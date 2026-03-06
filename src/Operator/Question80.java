package Operator;

import java.util.Scanner;

public class Question80 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enetr Number : "));
        int a = sc.nextInt();
        int count = 0;
        while(a>0){
            count++;
            a = a>>1;
        }
        System.out.println(count);
    }
}
