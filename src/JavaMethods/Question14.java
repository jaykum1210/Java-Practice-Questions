package JavaMethods;

import java.util.Scanner;

public class Question14 {
    //Minimum Element if Array
    int maximum(int[] arr){
        int len = arr.length;
        int max = arr[0];
        for (int i = 1;i<len;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question14 q = new Question14();
        System.out.println("Enter Size : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter " + len + " Elements : ");
        for (int i = 0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        int max = q.maximum(arr);
        System.out.println("Maximum Element : " + max);
    }
}
