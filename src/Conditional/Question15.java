package Conditional;

import java.util.Scanner;

public class Question15 {
    //Login System
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String name = sc.next();
        System.out.println("Enter Password : ");
        String pass = sc.next();
        String adminname = "Jay";
        String adminpass = "Jay123";
        if (name.equals(adminname) && pass.equals(adminpass)){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Login Failed");
        }
    }
}
