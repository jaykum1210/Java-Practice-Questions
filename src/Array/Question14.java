package Array;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        System.out.println("Enter " + a + " Numbers : ");
        for (int i = 0;i<a;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Size : ");
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        System.out.println("Enter " + b + " Numbers : ");
        for (int i = 0;i<a;i++){
            arr2[i] = sc.nextInt();
        }

        int[] arr = new int[a+b];
        for (int i = 0;i<a+b;i++){
            if (i<a){
                arr[i] = arr1[i];
            }
            else{
                arr[i] = arr2[i-a];
            }
        }
        System.out.print("Array : ");
        for (int i = 0;i<a+b;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
