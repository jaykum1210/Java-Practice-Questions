package String;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        int len = a.length();
        for (int i = 0;i<len-1;i++){
            char c = a.charAt(i+1);
            char d = a.charAt(i);
            if (i == len-2){
                System.out.println(c);
            }
            if (c == ' '){
                System.out.println(d);
            }
        }
    }
}
