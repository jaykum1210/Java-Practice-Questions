package Strings2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String s1 = sc.nextLine();
        int count = 1;
        int len = s1.length();
        for (int i = 0;i<len-1;i++){
            if (s1.charAt(i)==' ' && s1.charAt(i+1)!=' ') count++;
        }
        System.out.println("Words : " + count);
    }
}
