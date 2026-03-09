package Array;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        int[] temp = new int[a];
        System.out.println("Enter " + " Numbers : ");
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
            temp[i] = arr[i];
        }
        for(int i = 0;i<a;i++){
            arr[i] = temp[(i+1)%a];
        }
        System.out.println("Array : ");
        for (int i = 0;i<a;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
