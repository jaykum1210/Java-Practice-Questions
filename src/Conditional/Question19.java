package Conditional;

import java.util.Scanner;

public class Question19 {
    //Mobile Plan
    public
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Plan(1/2/3) : ");
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("1GB");
                break;
            case 2:
                System.out.println("2GB");
                break;
            default:
                System.out.println("Unlimited");
                break;
        }
    }
}
