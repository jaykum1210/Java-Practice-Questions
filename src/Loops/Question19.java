package Loops;

import java.util.Scanner;

public class Question19 {
    //LCM
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = a;
        int min = b;
        int gcd = 0;
        if (b>a){
            max = b;
            min = a;
        }
        if (max%min==0){
            gcd = min;
        }
        else{
            for (int i = min/2;i>0;i--){
                if (min%i==0 && max%i==0){
                    gcd = i;
                    break;
                }
            }
        }
        int lcm = (a*b)/gcd;
        System.out.println("LCM : " + lcm);
    }
}
