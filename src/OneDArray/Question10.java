package OneDArray;

import java.util.Scanner;

public class Question10 {
    //Max Min Difference
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
        int min = 999999;
        for (int x : arr){
            if (x>max) max = x;
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Difference : " + (max-min));
    }
}
