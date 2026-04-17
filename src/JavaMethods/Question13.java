package JavaMethods;

import java.util.Scanner;

public class Question13 {
    int minimum(int[] arr){
        int len = arr.length;
        int min = arr[0];
        for (int i = 1;i<len;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    //Minimum Element if Array
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question13 q = new Question13();
        System.out.println("Enter Size : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter " + len + " Elements : ");
        for (int i = 0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        int min = q.minimum(arr);
        System.out.println("Minimum Element : " + min);
    }
}
