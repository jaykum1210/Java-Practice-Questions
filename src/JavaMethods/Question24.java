package JavaMethods;

import java.util.Scanner;

public class Question24 {
    // Second Largest
    int second(int[] arr, int len){
        int largest = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++){
            if (arr[i] > largest){
                sec = largest;
                largest = arr[i];
            }
            else if (arr[i] > sec && arr[i] != largest){
                sec = arr[i];
            }
        }
        return sec;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question24 q = new Question24();

        System.out.println("Enter Size : ");
        int a = sc.nextInt();

        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }

        int sec = q.second(arr, a);
        System.out.println("Second Largest Number : " + sec);
    }
}