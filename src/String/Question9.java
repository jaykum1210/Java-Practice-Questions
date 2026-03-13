package String;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String a = sc.nextLine();
        int count = 1;
        for (int i = 1;i<a.length();i++){
            char c = a.charAt(i);
            char d = a.charAt(i-1);
            if (c == ' ' && d != ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
