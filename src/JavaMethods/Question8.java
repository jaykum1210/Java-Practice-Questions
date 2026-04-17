package JavaMethods;

import java.util.Scanner;

public class Question8 {
    int sum(int[] arr){
        int len = arr.length;
        int total = 0;
        for (int i = 0;i<len;i++){
            total+=arr[i];
        }
        return total;
    }
    //Sum of Array
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question8 q = new Question8();
        System.out.println("Enter Size : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter " + len + " Elements : ");
        for (int i = 0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        int total = q.sum(arr);
        System.out.println("Sum of Array : " + total);
    }
}
