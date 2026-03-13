package String;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        int len = a.length();
        for (int i = 0;i<len/2;i++){
            char b = a.charAt(i);
            char c = a.charAt(len-i-1);
            if (b!=c){
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
