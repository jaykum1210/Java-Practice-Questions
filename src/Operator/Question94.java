package Operator;

import java.util.*;

public class Question94 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int reversed = 0;

        while (n > 0) {
            reversed = (reversed << 1) | (n & 1);
            n = n >> 1;
        }

        if (original == reversed)
            System.out.println("Binary Palindrome");
        else
            System.out.println("Not Binary Palindrome");
    }
}
