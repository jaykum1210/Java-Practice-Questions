package Loops;

import java.util.Scanner;

public class Question45 {
    //Power of Two
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        while (a>1){
            int check = a>>1;
            if (check*2!=a){
                System.out.println("No");
                return;
            }
            a = a>>1;
        }
        System.out.println("Yes");
    }
}
