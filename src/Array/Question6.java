package Array;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Numbers : ");
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<a/2;i++){
            int temp = arr[i];
            arr[i] = arr[a-i-1];
            arr[a-i-1] = temp;
        }
        System.out.print("Array : ");
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
