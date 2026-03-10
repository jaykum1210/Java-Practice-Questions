package Array;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<a/2;i++){
            if (arr[i]!=arr[a-i-1]){
                System.out.println("Not A Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
