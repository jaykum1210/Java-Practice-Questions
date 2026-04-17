package JavaMethods;

import java.util.Scanner;

public class Question28 {
    //Merge Two Arrays
    int[] merge(int[] arr1, int[] arr2,int a, int b){
        int[] arr = new int[a+b];
        for (int i = 0;i<a+b;i++){
            if (i<a){
                arr[i] = arr1[i];
            }
            else {
                arr[i] = arr2[i-a];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question28 q = new Question28();
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size : ");
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        System.out.println("Enter " + b + " Elements : ");
        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr = q.merge(arr1, arr2, a, b);
        System.out.print("Array : ");
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
