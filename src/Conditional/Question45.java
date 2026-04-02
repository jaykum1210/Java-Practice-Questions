package Conditional;

import java.util.Scanner;

public class Question45 {
    //Subscription Upgrade
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Usage : ");
        int a = sc.nextInt();
        System.out.println("Enter Payment : ");
        String b = sc.next();
        System.out.println("Enter Complaints : ");
        int c = sc.nextInt();
        if (a>=50 && b.equals("paid") && c<=3){
            System.out.println("Upgraded");
        }
        else{
            System.out.println("Not Upgraded");
        }
    }
}
