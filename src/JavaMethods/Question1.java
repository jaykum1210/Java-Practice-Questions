package JavaMethods;

import java.util.Scanner;

public class Question1 {
    //Sum
    public int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question1 q = new Question1();
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = q.sum(a,b);
        System.out.println("Sum : " + total);
    }
}
