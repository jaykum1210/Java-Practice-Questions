package Loops;

import java.util.Scanner;

public class Question26 {
    //Decimal to Binary
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int binary = 0;
        int i = 0;
        while (a>0){
            int b = a%2;
            binary = b*(int)Math.pow(10,i++) + binary;
            a/=2;
        }
        System.out.println("Binary : " + binary);
    }
}
