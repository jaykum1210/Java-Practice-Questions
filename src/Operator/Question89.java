package Operator;

import java.util.Scanner;

public class Question89 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance : ");
        int a = sc.nextInt();
        if(a<1000){
            System.out.println(a-(0.1f*a));
        }
        else{
            System.out.println(a);
        }
    }
}
