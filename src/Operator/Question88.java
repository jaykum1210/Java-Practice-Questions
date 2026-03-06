package Operator;

import java.util.Scanner;

public class Question88 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        int a = sc.nextInt();
        System.out.println((a>=1000000?"20%":a>=60000?"15%":a>=40000?"10%":a>=20000?"5%":"0%") + " Hike");
    }
}
