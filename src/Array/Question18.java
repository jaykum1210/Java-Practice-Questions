package Array;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i]  =sc.nextInt();
        }
        System.out.println("Enter Sum : ");
        int b = sc.nextInt();
        for (int i = 0;i<a-1;i++){
            for (int j = i+1;j<a;j++){
                if ((arr[i] + arr[j] )== b){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
