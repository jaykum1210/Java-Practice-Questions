package Loops;

import java.util.Scanner;

public class Question14 {
    //Minimum Digit
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int min = 9999999;
        while (a>0){
            int b = a%10;
            if (b<min) min = b;
            a/=10;
        }
        System.out.println("Minimum Digit : " + min);
    }
}
