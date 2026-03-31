package Conditional;

import java.util.Scanner;

public class Question2 {
    //Scholarship Eligibility
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int m = sc.nextInt();
        System.out.println("Enter Income : ");
        int i = sc.nextInt();
        System.out.println("Enter Caste : ");
        String s = sc.next();
        s = s.toLowerCase();
        if (m>=85 && i<300000 && (s.equals("st") || s.equals("sc"))){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
