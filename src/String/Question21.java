package String;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String a = sc.nextLine();
        System.out.println("Enter Second String : ");
        String b = sc.nextLine();
        int len1 = a.length();
        int len2 = b.length();
        if (len2 !=len1){
            System.out.println(false);
            return;
        }
        String temp = a+a;
        System.out.println(temp.contains(b));
    }
}
