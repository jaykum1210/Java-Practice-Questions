package Loops;

import java.util.Scanner;

public class Question11 {
    //Prime
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for (int i = 2;i<=a/2;i++){
            if (a%i==0){
                System.out.println("Not a Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
