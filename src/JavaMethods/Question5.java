package JavaMethods;

import java.util.Scanner;

public class Question5 {
    //Power Method
    public int power(int a, int b){
        int num=0;
        int mul = 1;
        while (num<b){
            mul*=a;
            num++;
        }
        return mul;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question5 q = new Question5();
        System.out.println("Enter Base : ");
        int a = sc.nextInt();
        System.out.println("Enter power : ");
        int b = sc.nextInt();
        int total = q.power(a,b);
        System.out.println("Total : " + total);
    }
}
