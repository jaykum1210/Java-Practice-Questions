package Array;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Numbers : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int sec = arr[1];
        for (int i = 1;i<a;i++){
            if(arr[i]>max){
                sec = max;
                max = arr[i];
            } else if (arr[i] > sec) {
                sec = arr[i];
            }
        }
        System.out.println("Second Highest : " + sec);
    }
}
