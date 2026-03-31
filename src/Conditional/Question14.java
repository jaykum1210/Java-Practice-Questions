package Conditional;

import java.util.Scanner;

public class Question14 {
    //Temperature Classification
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature : ");
        int a = sc.nextInt();
        if (a<15){
            System.out.println("Cold");
        } else if (a <= 30) {
            System.out.println("Normal");
        }
        else{
            System.out.println("Hot");
        }
    }
}
