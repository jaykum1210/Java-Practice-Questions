package Loops;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Question16 {
    //Armstring Number
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int ori = a;
        int sum = 0;
        while (a>0){
            int b = a%10;
            sum+=(b*b*b);
            a/=10;
        }
        if (sum==ori){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }
    }
}
