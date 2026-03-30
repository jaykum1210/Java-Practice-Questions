package Basics;

import java.util.Scanner;

public class Question23 {
    //divisible by both 5 and 11
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        if (a%5==0 &&a%11==0){
            System.out.println("Yes");
        }
        else if(a%5==0){
            System.out.println("Divisible by 5");
        } else if (a % 11 == 0) {
            System.out.println("Divisible by 11");
        }
        else {
            System.out.println("No");
        }
    }
}
