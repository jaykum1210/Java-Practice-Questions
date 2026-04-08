package OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class Question49 {
    //Longest Consecutive
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max = 0;
        int count = 1;
        for (int i = 0;i<a-1;i++){
            if (arr[i+1]-arr[i]==1){
                count++;
                if (max<count) max = count;
            }
            else count = 1;
        }
        System.out.println("Maximum : " + max);
    }
}
