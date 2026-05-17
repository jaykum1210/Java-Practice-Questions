package Strings2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String s1 = sc.nextLine();
        int count = 0;
        int len = s1.length();
        for (int i = 0;i<len;i++){
            char c = Character.toLowerCase(s1.charAt(i));
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') count++;
        }
        System.out.println("Number of Vowels : " + count);
    }
}
