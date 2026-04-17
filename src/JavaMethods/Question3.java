package JavaMethods;

import java.util.Scanner;

public class Question3 {
    public int Max2(int a, int b){
        if (a>b) return a;
        return b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question3 q = new Question3();
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Maximum Number : " + q.Max2(a,b));
    }
}
