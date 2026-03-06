package Operator;

import java.util.Scanner;

public class Question79 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        int c = a^b;
        int i = 0;
        int count = 0;
        while(i<c){
            if((c&(1<<i))!=0){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
