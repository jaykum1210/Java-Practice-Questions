package Conditional;

import java.util.Scanner;

public class Question46 {
    //Role Access
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Role : ");
        String a = sc.next();
        if (a.equals("admin")){
            System.out.println("Admin Access");
        } else if (a.equals("editor")) {
            System.out.println("Editor Access");
        }
        else {
            System.out.println("User Access");
        }
    }
}
