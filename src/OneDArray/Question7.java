package OneDArray;

import java.util.Scanner;

public class Question7 {
    //Count Occurance
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        int count = 0;
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Number : ");
        int b = sc.nextInt();
        for (int e : arr){
            if (e == b) count++;
        }
        System.out.println("Occurance of " + b + " : " + count);
    }
}
