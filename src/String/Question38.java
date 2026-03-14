package String;

import java.util.Scanner;

public class Question38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        String temp = a;
        a = "";
        for (int i = 0;i<temp.length();i++){
            char c = temp.charAt(i);
            if (c>='0' && c<='9'){
                a+=c;
            }
        }
        System.out.println(a);
    }
}
