package Conditional;

import java.util.Scanner;

public class Question11 {
    //Student Result
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of English : ");
        int a = sc.nextInt();
        System.out.println("Enter Marks of Hindi : ");
        int b = sc.nextInt();
        System.out.println("Enter Marks of Maths : ");
        int c = sc.nextInt();
        System.out.println("Enter Marks of Science : ");
        int d = sc.nextInt();
        System.out.println("Enter Marks of SST : ");
        int e = sc.nextInt();
        if (a>=40 && b>=40 && c>=40 && d>=40 && e>=40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

    }
}
