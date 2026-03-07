package Array;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter : " + a + " Numbers" );
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int sum1 = ((a+1)*(a+2))/2;
        int sum2 = 0;
        for (int i = 0;i<a;i++){
            sum2+=arr[i];
        }
        System.out.println("Missing Number : " + (sum1-sum2));
    }
}
