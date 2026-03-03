package Operator;

import java.util.Scanner;

public class Question62 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character : ");
        char a = sc.next().charAt(0);
        String b = (a>='A' && a<='Z')?"Uppercase":"Lowercase";
        System.out.println(b);
    }
}
