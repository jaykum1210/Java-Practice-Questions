package Conditional;

import java.util.Scanner;

public class Question26 {
    //Promotion
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Experience : ");
        int a = sc.nextInt();
        System.out.println("Enter Rating : ");
        int b = sc.nextInt();
        System.out.println("Enter Attendance : ");
        int c = sc.nextInt();
        if (a>=4 && b>=4 && c>=75){
            System.out.println("Promoted");
        }
        else{
            System.out.println("Not Promoted");
        }
    }
}
