package Strings2;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s1 = sc.nextLine();
        int count = 0;
        for (int i = 0;i<s1.length();i++){
            if (s1.charAt(i)>='0' && s1.charAt(i)<='9'){
                count++;
            }
        }
        System.out.println("Digits : " + count);
    }
}
