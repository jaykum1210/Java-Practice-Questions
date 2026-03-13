package String;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        int len = a.length();
        for (int i = 0;i<len-1;i++){
            char c = a.charAt(i);
            char d = a.charAt(i+1);
            if(i == 0){
                System.out.println(c);
            }
            if (c == ' '){
                System.out.println(d);
            }
        }
    }
}
