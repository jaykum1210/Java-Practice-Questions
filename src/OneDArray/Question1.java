package OneDArray;

import java.util.Scanner;

public class Question1 {
    //Sum of Array
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter " + len + " Elements : ");
        for (int i = 0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0;i<len;i++){
            sum+=arr[i];
        }
        System.out.println("Sum : " + sum);
    }
}
