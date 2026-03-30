package Basics;

import java.util.Scanner;

public class Question27 {
    // Alphabet Case
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character : ");
        char ch = sc.next().charAt(0);
        if (ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("LowerCase");
        }
        else{
            System.out.println("Not Alphabet");
        }
    }
}
