package Strings2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String s2 = sc.nextLine();
        s1 = s1 + " " + s2;
        System.out.println(s1);
    }
}
