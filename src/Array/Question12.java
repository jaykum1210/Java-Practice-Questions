package Array;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Numbers : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for (int i =1;i<a;i++){
            for(int j = i-1;j>=0;j--){
                if (arr[i]==arr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
