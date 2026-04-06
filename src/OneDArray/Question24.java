package OneDArray;

import java.util.Scanner;

public class Question24 {
    //Missing Number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " +a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int e : arr){
            sum+=e;
        }
        int total = ((a+1)*(a+2))/2;
        System.out.println("Missing Number : " + (total-sum));
    }
}
