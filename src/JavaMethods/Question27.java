package JavaMethods;

import java.util.Scanner;

public class Question27 {
    //Array Reverse
    void reverse(int[] arr, int len){
        for (int i = 0;i<len/2;i++){
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question27 q = new Question27();
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        q.reverse(arr,a);
        System.out.println("Array : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}
