package Conditional;

import java.util.Scanner;

public class Question39 {
    //Traffic Fine
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Speed : ");
        int a = sc.nextInt();
        System.out.println("Red Light ?? : ");
        boolean b = sc.nextBoolean();
        int fine = 0;
        if (a>=70 && b){
            fine = 2000;
        } else if (a >= 70 || b) {
            fine = 1000;
        }
        else {
            fine = 0;
        }
        System.out.println("Fine : " + fine);
    }
}
