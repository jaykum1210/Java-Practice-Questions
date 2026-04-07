package OneDArray;

import java.util.Scanner;

public class Question32 {
    //Longest Increasing
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int count = 0;
        for (int i = 0;i<a-1;i++){
            if (arr[i]<arr[i+1]){
                count++;
                if (count>max) max = count;
            } else if (arr[i] > arr[i + 1]) {
                count = 1;
            }
        }
        System.out.println("Longest Increasing : " + max);
    }
}
