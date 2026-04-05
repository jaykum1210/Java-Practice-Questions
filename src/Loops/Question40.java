package Loops;

import java.util.Scanner;

public class Question40 {
    //Split Sum
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        String num = sc.next();
        int n = num.length();
        boolean found = false;
        for (int i = 1; i < n; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += num.charAt(j) - '0';
            }
            for (int j = i; j < n; j++) {
                rightSum += num.charAt(j) - '0';
            }
            if (leftSum == rightSum) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("YES, possible split exists");
        else
            System.out.println("NO split possible");
    }
}