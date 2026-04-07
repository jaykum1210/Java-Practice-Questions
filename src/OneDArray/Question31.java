package OneDArray;

import java.util.Scanner;

public class Question31 {
    //Maximum Subarray Sum
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
        for (int i = 0;i<a-1;i++){
            int sum = arr[i];
            for (int j = i+1;j<a;j++){
                if (sum>max){
                    max = sum;
                }
                sum+=arr[j];
            }
        }
        System.out.println("Maximum Sum : " + max);
    }
}
