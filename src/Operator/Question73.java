package Operator;

import java.util.Scanner;

public class Question73 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        int a = sc.nextInt();;
        System.out.println(a>=50000?(a + a*0.3f):a>=20000?(a + a*0.2f):(a + a*0.1));
    }
}
