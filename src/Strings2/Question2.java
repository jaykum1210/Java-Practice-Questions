package Strings2;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String s = sc.nextLine();
        int len = 0;
        for (char e : s.toCharArray()){
            len++;
        }
        System.out.println("Length : " + len);
    }
}
