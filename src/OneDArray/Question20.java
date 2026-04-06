package OneDArray;

import java.util.Scanner;

public class Question20 {
    //Rotate Left
    public static void reverse(int[] arr, int start, int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Position : ");
        int b = sc.nextInt();
        b = b%a;
        reverse(arr,0,a-1);
        reverse(arr, b,a-1);
        reverse(arr,0,b-1);
        System.out.println("Array : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}
