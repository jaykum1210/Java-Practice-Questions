package Conditional;

import java.util.Scanner;

public class Question33 {
    //Game Score
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Score : ");
        int a = sc.nextInt();
        if (a>=1200){
            System.out.println("Gold");
        }
        else if (a>=800){
            System.out.println("Silver");
        } else if (a >= 600) {
            System.out.println("Bronze");
        }
        else{
            System.out.println("Failed");
        }
    }
}
