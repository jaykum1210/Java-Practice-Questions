package Array;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int min = 999999;
        int max = 0;
        for (int i = 0;i<a;i++){
            if (arr[i]<min){
                min = arr[i];
            }
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Lasrgest Difference : " + (max-min));
    }
}
