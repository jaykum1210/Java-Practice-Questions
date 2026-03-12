package Array;

import java.util.Scanner;

public class Question40 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        boolean x = true;
        for (int i = 0;i<a;i++){
            x = true;
            for (int j=i+1;j<a;j++){
                if (arr[i] < arr[j]){
                    x = false;
                    break;
                }
            }
            if (x){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
