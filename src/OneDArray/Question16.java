package OneDArray;

import java.util.Scanner;

public class Question16 {
    // Second Largest Element
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int n = sc.nextInt();
        if(n < 2){
            System.out.println("Array must have at least 2 elements");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if (arr[i] > max){
                sec = max;
                max = arr[i];
            }
            else if (arr[i] > sec && arr[i] != max){
                sec = arr[i];
            }
        }
        if(sec == Integer.MIN_VALUE){
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second Maximum : " + sec);
        }
    }
}