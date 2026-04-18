package JavaMethods;

import java.util.Scanner;

public class Question31 {
    //Max SubArray Sum
    int sum(int[] arr, int len){
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<len;i++){
            int sum = 0;
            for (int j = i;j<len;j++){
                sum+=arr[j];
                if (sum>max) max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question31 q = new Question31();
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " +a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int num = q.sum(arr,a);
        System.out.println("Maximum Substring Sum : " + num);
    }
}
