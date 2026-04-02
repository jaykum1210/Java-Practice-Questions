package Conditional;

import java.util.Scanner;

public class Question35 {
    //Insurance
    public
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int a = sc.nextInt();
        System.out.println("Smoker : ");
        boolean s = sc.nextBoolean();
        System.out.println("Disease : ");
        boolean d = sc.nextBoolean();
        if (a<60 && !s && !d){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
