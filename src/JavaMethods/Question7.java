package JavaMethods;

import java.util.Scanner;

public class Question7 {
    //Reverse String
    public String reverse(String str){
        String temp = "";
        int len = str.length();
        for (int i = len-1;i>=0;i--){
            temp+=str.charAt(i);
        }
        return temp;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question7 q = new Question7();
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        String rev = q.reverse(str);
        System.out.println("Reverse : " + rev);
    }
}
