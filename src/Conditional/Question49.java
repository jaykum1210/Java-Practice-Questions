package Conditional;

import java.util.Scanner;

public class Question49 {
    //Course Admission
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int a = sc.nextInt();
        System.out.println("Entrance : ");
        boolean b = sc.nextBoolean();
        if (a >=80 && b){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
