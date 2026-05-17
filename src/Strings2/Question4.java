package Strings2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String s = sc.nextLine();
        int len = s.length();
        System.out.println("Last Character : " + s.charAt(len-1));
    }
}
