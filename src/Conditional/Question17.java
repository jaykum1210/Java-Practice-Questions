package Conditional;

import java.util.Scanner;

public class Question17 {
    //Character Type
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character : ");
        char ch = sc.next().charAt(0);
        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        else{
            System.out.println("Special");
        }
    }
}
