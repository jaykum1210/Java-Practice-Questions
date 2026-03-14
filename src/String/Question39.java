package String;

import java.util.Scanner;

public class Question39 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        int len = a.length();
        String temp = a;
        a = "";
        for (int i = 0;i<len;i++){
            char c = temp.charAt(i);
            if (c>='a' && c<='z'){
                a+=(char)(c-32);
            } else if (c>='A' && c<='Z') {
                a+=(char)(c+32);
            }
            else{
                a+=c;
            }
        }
        System.out.println(a);
    }
}
