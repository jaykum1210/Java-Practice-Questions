package OneDArray;

import java.util.Scanner;

public class Question15 {
    //Check Sorted
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<a-1;i++){
            if (arr[i]>arr[i+1]){
                System.out.println("Not Sorted");
                return;
            }
        }
        System.out.println("Sorted");
    }
}
