package String;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        int len = a.length();
        String temp = a;
        a = "";
        for (int i = len-1;i>=0;i--){
            a = a + temp.charAt(i);
        }
        System.out.println("String : " + a);
    }
}
