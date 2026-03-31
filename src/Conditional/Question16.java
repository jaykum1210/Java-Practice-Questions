package Conditional;

import java.util.Scanner;

public class Question16 {
    // Marks Average
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
        float avg = (float) (a+b+c+d)/4;
        if (avg>=40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
