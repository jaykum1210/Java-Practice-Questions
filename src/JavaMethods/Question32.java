package JavaMethods;

import java.util.Scanner;

public class Question32 {
    // Binary Search
    String binary(int left, int right, int[] arr, int b){
        if (left > right) return "Not Found";
        int mid = (left + right) / 2;
        if (arr[mid] == b) return "Found";
        else if (arr[mid] > b){
            return binary(left, mid - 1, arr, b);
        }
        else{
            return binary(mid + 1, right, arr, b);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question32 q = new Question32();
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements (Sorted): ");
        for (int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = a - 1;
        System.out.println("Enter Number : ");
        int b = sc.nextInt();
        String found = q.binary(left, right, arr, b);
        System.out.println(found);
    }
}