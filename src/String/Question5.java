package String;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        String temp = a;
        a = "";
        for (int i = 0;i<temp.length();i++){
            a = a + Character.toUpperCase(temp.charAt(i));
        }
        System.out.println("String : " + a);
    }
}
