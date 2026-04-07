package OneDArray;

import java.util.Scanner;

public class Question43 {
    // Peak Element
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
        for (int e :arr){
            if (e>max) max = e;
        }
        System.out.println("Peak Element : "+ max);
    }
}
