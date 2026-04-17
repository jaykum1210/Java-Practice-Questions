package JavaMethods;

import java.util.Scanner;

public class Question16 {
    //GCD
    int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question16 q = new Question16();
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = q.gcd(a,b);
        System.out.println("GCD : " + num);
    }
}
