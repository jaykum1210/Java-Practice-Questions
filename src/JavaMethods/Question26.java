package JavaMethods;

import java.util.Scanner;

public class Question26 {
    //Sorted or Not
    String sorted(int[] arr, int len){
        for (int i = 0;i<len-1;i++){
            if (arr[i]>arr[i+1]) return "No";
        }
        return "Yes";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question26 q = new Question26();
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(q.sorted(arr,a));
    }
}
