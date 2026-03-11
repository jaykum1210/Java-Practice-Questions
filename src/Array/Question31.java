package Array;

import java.util.Scanner;

public class Question31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        System.out.println("Enter " + a + " Elements : ");
        int[] arr = new int[a];
        int[] temp = new int[a];
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
            temp[i] = arr[i];
        }
        for (int i = 0;i<a;i++){
            int mul = 1;
            int count = 0;
            while (count<a-1){
                mul*=temp[(i+count+1)%a];
                count++;
            }
            arr[i] = mul;
        }
        System.out.println("Array : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}
