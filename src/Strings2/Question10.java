package Strings2;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s1 = sc.nextLine();
        int count = 0;
        for(int i = 0;i<s1.length();i++){
            char c = s1.charAt(i);
            if (!((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9') || c==' ')) count++;
        }
        System.out.println("Special Characters : " + count);
    }
}
