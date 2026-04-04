package Loops;

import javax.print.attribute.SupportedValuesAttribute;
import java.util.Scanner;

public class Question28 {
    //Automorphic Number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int sq = a*a;
        while (a>0){
            int b = a%10;
            int c = sq%10;
            if (b!=c){
                System.out.println("Not Automorphic Number");
                return;
            }
            a/=10;
            sq/=10;
        }
        System.out.println("Automorphic Number");
    }
}
