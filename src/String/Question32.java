package String;

import java.util.Scanner;

public class Question32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        String temp = a;
        a = "";
        int len = temp.length();
        for (int i = 0;i<len;i+=2){
            char c = temp.charAt(i);
            char d = temp.charAt(i+1);
            for (int j = 0;j<(d-'0');j++){
                a+=c;
            }
        }
        System.out.println(a);
    }
}
