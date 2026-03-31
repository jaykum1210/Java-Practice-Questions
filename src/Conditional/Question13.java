package Conditional;

import java.util.Scanner;

public class Question13 {
    //Speed Fine
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Speed : ");
        int a = sc.nextInt();
        if (a>80){
            System.out.println("Fine : " + 1000);
        }
        else{
            System.out.println("Fine : " + 2000);
        }
    }
}
