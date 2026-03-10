package Array;

import java.util.Scanner;

public class Question28 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size : ");
        int a = sc.nextInt();

        int[] arr = new int[a];

        System.out.println("Enter Elements : ");
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < a-1; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}