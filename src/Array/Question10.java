package Array;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Numbers : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Number : ");
        int b = sc.nextInt();
        for (int i = 0;i<a;i++){
            if (arr[i] == b){
                System.out.println("Found at index : " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
