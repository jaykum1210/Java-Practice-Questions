package Conditional;

import java.util.Scanner;

public class Question32 {
    //Banking Penalty
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance : ");
        int a = sc.nextInt();
        System.out.println("Enter Month : ");
        int b = sc.nextInt();
        float p = 0;
        if (a<1000 && b>3){
            p = a - a*0.05f;
        }
        else{
            p = a;
        }
        System.out.println("Balance : " + p);
    }
}
