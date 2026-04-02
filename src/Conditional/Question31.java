package Conditional;

import java.util.Scanner;

public class Question31 {
    //Attendance
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Attendance : ");
        int a = sc.nextInt();
        System.out.println("Enter Medical : ");
        boolean b = sc.nextBoolean();
        if (b){
            if (a+20>=75){
                System.out.println("Eligible");
            }
            else{
                System.out.println("Not Eligible");
            }
        }
        else{
            System.out.println("Not Eligible");
        }

    }
}
