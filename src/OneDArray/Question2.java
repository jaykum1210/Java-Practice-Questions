package OneDArray;

import java.util.Scanner;

public class Question2 {
    //Find Maximum Element
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter " + " Elements : ");
        for (int i = 0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int e : arr){
            if (e>max) max = e;
        }
        System.out.println("Maximum Element : " + max);
    }
}
