package Array;

import java.util.Scanner;

public class Question38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum Needed : ");
        int b = sc.nextInt();
        for (int i = 0;i<a-1;i++){
            int sum = 0;
            for (int j = i;j<a;j++){
                sum+=arr[j];
                if (sum==b){
                    System.out.println("Found");
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }
}
