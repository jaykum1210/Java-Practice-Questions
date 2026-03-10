package Array;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int element : arr){
            sum+=element;
        }
        float avg = (float)sum/a;
        int count = 0;
        for (int element : arr){
            if (element>avg){
                count++;
            }
        }
        System.out.println(count);
    }
}
