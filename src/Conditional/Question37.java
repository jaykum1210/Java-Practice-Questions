package Conditional;

import java.util.Scanner;

public class Question37 {
    //Grace Marks
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int a = sc.nextInt();
        boolean g = false;
        if (a<=30 && a>25){
            System.out.println("Grace : ");
            g = sc.nextBoolean();
        }
        if (a>=33 || g){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
