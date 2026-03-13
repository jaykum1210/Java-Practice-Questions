package String;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        System.out.println("Enter Character : ");
        char b = sc.nextLine().charAt(0);
        int coun = 0;
        for (int i = 0;i<a.length();i++){
            if (a.charAt(i) == b){
                coun++;
            }
        }
        System.out.println(coun);
    }
}
