package Array;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Numbers : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int sec = arr[1];
        for (int i = 0;i<a;i++){
            if(arr[i]<min){
                sec = min;
                min = arr[i];
            } else if (arr[i] < sec) {
                sec = arr[i];
            }
        }
        System.out.println("Second Lowest : " + sec);
    }
}
