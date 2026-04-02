package Conditional;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Question30 {
    // OTT Plan
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month : ");
        int a = sc.nextInt();
        System.out.println("Payment/Month : ");
        int b = sc.nextInt();
        if (a>=3 && b>=250){
            System.out.println("Premium");
        }
        else{
            System.out.println("Basic");
        }
    }
}
