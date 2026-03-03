package Operator;

import java.util.Scanner;

public class Question37 {
    //Check Power of 2
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        boolean b = (a>0 && (a & (a-1))==0);
        System.out.println(b);
    }
}
