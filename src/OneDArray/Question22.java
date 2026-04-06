package OneDArray;

import java.util.Scanner;

public class Question22 {
    //Merge Arrays
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array 1 : ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        System.out.println("Enter " + a + " Elements of Array 1 : ");
        for (int i = 0;i<a;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Size of Array 2 : ");
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        System.out.println("Enter " + b + " Elements of Array 2 : ");
        for (int i = 0;i<b;i++){
            arr2[i] = sc.nextInt();
        }
        int total = a+b;
        int[] arr3 = new int[total];
        for (int i = 0;i<total;i++){
            if (i<a){
                arr3[i] = arr1[i];
            }
            else {
                arr3[i] = arr2[i-a];
            }
        }
        System.out.println("Array : ");
        for (int e : arr3){
            System.out.print(e + " ");
        }
    }
}
