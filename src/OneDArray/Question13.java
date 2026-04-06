package OneDArray;

import java.util.Scanner;

public class Question13 {
    //Count Positive
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a+ " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0;i<a;i++){
            if (arr[i]>0){
                count++;
            }
        }
        System.out.println("Positive Number : " +count);
    }
}
