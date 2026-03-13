package String;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        int start = 0;
        int len = a.length();
        int i = 0;
        String temp = a;
        a = "";
        while (i < temp.length()){
            char c = temp.charAt(i);
            if (c == ' '){
                for (int j = i-1; j >= start; j--){
                    a = a + temp.charAt(j);
                }
                a += ' ';
                start = i + 1;
            }
            else if (i == len-1){
                for (int j = i; j >= start; j--){
                    a = a + temp.charAt(j);
                }
            }
            i++;
        }
        System.out.println(a);
    }
}