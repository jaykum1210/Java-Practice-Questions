package OneDArray;

import java.util.Scanner;

public class Question44 {
    //Circular Subarray Sum
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
        for (int i = 0;i<a;i++){
            int sum = arr[i];
            if (arr[i]>max) max = arr[i];
            for (int j = 1;j<a;j++){
                sum+=arr[(i+j)%a];
                if (sum>max) max = sum;
            }
        }
        System.out.println("Sum : " + max);
    }
}
