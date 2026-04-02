package Conditional;

import java.util.Scanner;

public class Question29 {
    public static boolean checkFirst(String pass){
        if (pass.charAt(0)>='A' && pass.charAt(0)<='Z'){
            return true;
        }
        return false;
    }
    public static boolean checkNum(String pass){
        for (int i = 0;i<pass.length();i++){
            char ch = pass.charAt(i);
            if (ch>='0' && ch<='9'){
                return true;
            }
        }
        return false;
    }
    public static boolean checkSpecial(String pass){
        for (int i = 0;i<pass.length();i++){
            char ch = pass.charAt(i);
            if (!((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))){
                return true;
            }
        }
        return false;
    }
    //Password Validation
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String pass = sc.next();
        if (checkFirst(pass) && checkNum(pass) && checkSpecial(pass)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
