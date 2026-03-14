package String;

import java.util.Scanner;

public class Question30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email : ");
        String a = sc.nextLine();
        System.out.println(a.contains("@") && a.contains("."));
    }
}
