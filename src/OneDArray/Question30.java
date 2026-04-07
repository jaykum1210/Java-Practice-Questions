package OneDArray;

import java.util.Scanner;

public class Question30 {
    //Equilibrium Index
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = a - 1;
        int sum1 = arr[left];
        int sum2 = arr[right];
        while (left < right){
            if (sum1 < sum2){
                left++;
                sum1 += arr[left];
            } else {
                right--;
                sum2 += arr[right];
            }
        }
        if (sum1 == sum2){
            System.out.println(left);
        } else {
            System.out.println("No");
        }
    }
}