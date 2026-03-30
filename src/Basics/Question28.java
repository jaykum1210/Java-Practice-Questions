package Basics;

import java.util.Scanner;

public class Question28 {
    // Seconds to hours and min and sec
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds : ");
        int a = sc.nextInt();
        int hours = a/3600;
        int min = (a%3600)/60;
        int sec = a%60;
        System.out.println(hours + "h " + min + "min " + sec + "sec");
    }
}
