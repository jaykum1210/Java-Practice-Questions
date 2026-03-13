package String;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        System.out.println("Enter Old Character : ");
        char b = sc.nextLine().charAt(0);
        System.out.println("Enter New Character : ");
        char c = sc.nextLine().charAt(0);
        String temp = a;
        a = "";
        for (int i = 0;i<temp.length();i++){
            char ch = temp.charAt(i);
            if (ch == b){
               a+=c;
            }
            else {
                a+=ch;
            }
        }
        System.out.println("String : " + a);
    }
}
