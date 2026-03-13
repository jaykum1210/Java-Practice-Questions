package String;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String a = sc.nextLine();
        System.out.println("Enter Second String : ");
        String b = sc.nextLine();
        int len1 = a.length();
        int len2 = b.length();
        if (len2 != len1){
            System.out.println("Not Anagram");
            return;
        }
        int count1;
        int count2;
        for (int i = 0; i < len1; i++){
            count1 = 1;
            count2 = 0;
            boolean flag = true;
            char ch = a.charAt(i);
            for (int j = i-1; j >= 0; j--){
                if (ch == a.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(!flag) continue;   // skip repeated characters
            for (int j = i+1; j < len1; j++){
                if (ch == a.charAt(j)){
                    count1++;
                }
            }
            for (int j = 0; j < len2; j++){
                if (ch == b.charAt(j)){
                    count2++;
                }
            }
            if (count1 != count2){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}