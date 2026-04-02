package Loops;

import java.util.Scanner;

public class Question10 {
    //Palindrome
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int ori = a;
        int rev = 0;
        while (a>0){
            int b = a%10;
            rev = rev*10 +b;
            a/=10;
        }
        if (ori==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
