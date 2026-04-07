package OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class Question46 {
    //Chocolate Distribution
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " +a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter Number : ");
        int b = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<a-b;i++){
            int diff = arr[i+b-1] - arr[i];
            if (diff<min) min = diff;
        }
        System.out.println("Minimum Difference : " + min);
    }
}
