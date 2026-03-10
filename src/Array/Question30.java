package Array;

import java.util.Scanner;

public class Question30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int max = 0;
        for (int i = 0;i<a-1;i++){
            if (arr[i]<arr[i+1]){
                count++;
            }
            else{
                count = 0;
            }
            if (count>max){
                max = count;
            }
        }
        System.out.println(max);
    }
}
