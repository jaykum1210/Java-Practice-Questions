package String;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        for (int i = 0;i<a.length();i++){
            System.out.println(a.charAt(i));
        }
    }
}
