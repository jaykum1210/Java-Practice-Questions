package Basics;

import java.util.Scanner;

public class Question24 {
    // Assign grade based on marks
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int a = sc.nextInt();
        if (a>=90){
            System.out.println("A+");
        } else if (a>=80) {
            System.out.println('A');
        } else if (a >= 70) {
            System.out.println("B+");
        } else if (a >= 60) {
            System.out.println('B');
        } else if (a >= 50) {
            System.out.println('C');
        } else if (a >= 40) {
            System.out.println('D');
        }
        else{
            System.out.println('F');
        }
    }
}
