package Operator;

import java.util.Scanner;

public class Question47 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sell Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Buy Number : ");
        int b = sc.nextInt();
        int diff = a-b;
        if(diff<0){
            System.out.println("Loss : " + (-diff));
        }
        else{
            System.out.println("Profit : " + diff);
        }
    }
}
