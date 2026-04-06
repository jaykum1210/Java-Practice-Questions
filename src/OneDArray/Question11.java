package OneDArray;

import java.util.Scanner;

public class Question11 {
    //Copy Array
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr1[i] = sc.nextInt();
        }
        for (int i = 0;i<a;i++){
            arr2[i] = arr1[i];
        }
        System.out.println("Array : ");
        for (int e : arr2){
            System.out.print(e + " ");
        }
    }
}
