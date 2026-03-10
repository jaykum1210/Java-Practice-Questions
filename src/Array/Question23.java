package Array;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0;i<a;i++){
            if (arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while (count<a){
            arr[count++] = 0;
        }
        System.out.println("Array : ");
        for (int i = 0;i<a;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
