package Strings2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String s = sc.nextLine();
        System.out.println("First Letter : " + s.charAt(0));
    }
}
