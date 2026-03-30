package Basics;

import java.util.Scanner;

public class Question18 {
    //Positive, Negative, Zero
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        if (a==0){
            System.out.println("Zero");
        } else if (a > 0) {
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
