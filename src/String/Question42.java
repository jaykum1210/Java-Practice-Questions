package String;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Question42 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        String temp = a;
        a = "";
        for (int i = 0;i<temp.length();i++){
            char c = temp.charAt(i);
            if (i!=0){
                if (c == temp.charAt(i-1)){
                    continue;
                }
            }
            a = a + c;
        }
        System.out.println(a);
    }
}
