package JavaMethods;

import java.util.Scanner;

public class Question4 {
    //Factorial Method
    public int fact(int a){
        if (a==1 || a==0) return a;
        return a*fact(a-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question4 q = new Question4();
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int total = q.fact(a);
        System.out.println("Factorial of " + a + " : " + total);
    }
}
