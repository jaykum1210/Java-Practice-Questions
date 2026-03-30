package Basics;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Question36 {
    // Electricity Bill
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Unit : ");
        int a = sc.nextInt();
        System.out.println("Bill : " + a*8);
    }
}
