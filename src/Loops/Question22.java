package Loops;

import java.util.Scanner;

public class Question22 {
    //Sum of Factorial Series
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 1;
        for (int i = 2;i<=a;i++){
            int fact = 1;
            for (int j = 2;j<=i;j++){
                fact*=j;
            }
            sum+=fact;
        }
        System.out.println("Sum : " + sum);
    }
}
