package Loops;

import java.util.Scanner;

public class Question33 {
    // Happy Number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        while (n != 1 && n != 4) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        if (n == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");
    }
}