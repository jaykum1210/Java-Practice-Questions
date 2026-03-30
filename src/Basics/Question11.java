package Basics;

import java.util.Scanner;

public class Question11 {
    //Profit Loss
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price : ");
        int a = sc.nextInt();
        System.out.println("Enter Selling Price : ");
        int b = sc.nextInt();
        if(b-a>0){
            System.out.println("Profit");
        }
        else{
            System.out.println("Loss");
        }
    }
}
