package OneDArray;

import java.util.Scanner;

public class Question48 {
    //Stock Buy Sell
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<a-1;i++){
            for (int j = i+1;j<a;j++){
                if (arr[j]-arr[i]>max) max = arr[j]-arr[i];
            }
        }
        System.out.println("Maximum : " + max);
    }
}
