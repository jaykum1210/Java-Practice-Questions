package Array;

import java.util.Scanner;

public class Question34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Kth Largest Number : ");
        int b = sc.nextInt();
        for(int i = 0;i<a-1;i++){
            for(int j = 0;j<a-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(b + " Largest Number : " + arr[b-1]);
    }
}
