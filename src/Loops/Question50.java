package Loops;

import java.util.Scanner;

public class Question50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int steps = 0;
        while (n > 0) {
            int temp = n;
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            n -= sum;
            steps++;
        }
        System.out.println("Steps: " + steps);
    }
}