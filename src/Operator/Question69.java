package Operator;

import java.util.Scanner;

public class Question69 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((a>=100000)?"20% Tax":(a>=50000)?"10% Tax":(a>=20000)?"5% Tax":"0% Tax");
    }
}
