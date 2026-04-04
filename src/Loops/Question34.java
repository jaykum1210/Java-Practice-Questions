package Loops;

import java.util.Scanner;

public class Question34 {
        //Circular Prime
        public static boolean isPrime(int n) {
            if (n < 2) return false;

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            int temp = n;
            int digits = 0;
            // count digits
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            int divisor = (int)Math.pow(10, digits - 1);
            boolean flag = true;
            for (int i = 0; i < digits; i++) {
                if (!isPrime(n)) {
                    flag = false;
                    break;
                }
                // rotate number
                int last = n % 10;
                n = last * divisor + n / 10;
            }
            if (flag)
                System.out.println("All rotations are prime (Circular Prime)");
            else
                System.out.println("Not a Circular Prime");
        }
}
