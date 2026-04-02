package Conditional;

import java.util.Scanner;

public class Question47 {
    //Game Reward
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Score : ");
        int a = sc.nextInt();
        System.out.println("Enter Time : ");
        int b = sc.nextInt();
        if (a>=1100 &&b<=60){
            System.out.println("Bonus");
        }
        else{
            System.out.println("No Bonus");
        }
    }
}
