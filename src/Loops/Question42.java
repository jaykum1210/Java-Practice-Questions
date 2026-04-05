package Loops;

import java.util.Scanner;

public class Question42 {
    //Count Ways
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int count = 2;
        for (int i = 3;i<=a/2;i+=2){
            if (a%i==0){
                count++;
            }
        }
        System.out.println("Number of Ways : " + count);
    }
}
