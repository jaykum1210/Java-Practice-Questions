package JavaMethods;

import java.util.Scanner;

public class Question10 {
    void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    //Swap Two Numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question10 q = new Question10();
        int[] arr = new int[2];
        System.out.println("Enter Two numbers : ");
        for (int i = 0;i<2;i++){
            arr[i] = sc.nextInt();
        }
        q.swap(arr);
        System.out.print("Numbers : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}
