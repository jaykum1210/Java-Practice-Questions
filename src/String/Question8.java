package String;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String a = sc.nextLine();
        String temp = a;
        a = "";
        for (int i = 0;i<temp.length();i++){
            char c = temp.charAt(i);
            if (c !=' '){
                a = a + c;
            }
        }
        System.out.println("String : " + a);
    }
}
