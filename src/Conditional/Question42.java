package Conditional;

import java.util.Locale;
import java.util.Scanner;

public class Question42 {
    //Exam Retake
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pass/Fail : ");
        String a = sc.next();
        a = a.toLowerCase();
        int att;
        if (a.equals("fail")){
            System.out.println("Enter Attendance : ");
            att = sc.nextInt();
            if (att>=60){
                System.out.println("Retake Exam");
            }
            else{
                System.out.println("No Retake");
            }
        }
        else{
            System.out.println("No Retake ");
        }

    }
}
