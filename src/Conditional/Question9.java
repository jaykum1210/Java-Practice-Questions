package Conditional;

import java.util.Scanner;

public class Question9 {
    public static boolean containsDigit(String pass){
        for (int i = 0;i<pass.length();i++){
            char ch = pass.charAt(i);
            if (ch >='0' && ch<='9'){
                return true;
            }
        }
        return false;
    }
    // Password Strength
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String pass = sc.next();
        if (pass.length()>=10 && containsDigit(pass)){
            System.out.println("Strong");
        } else if (pass.length() >= 6) {
            System.out.println("Medium");
        }
        else{
            System.out.println("Weak");
        }
    }
}
