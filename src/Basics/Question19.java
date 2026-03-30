package Basics;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Question19 {
    // Converts Days to Years
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Days : ");
        int a = sc.nextInt();
        int year = a/365;
        int days = a%365;
        System.out.println(year + " years " + days + " days");
    }
}
