package Array;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Numbers : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<a;i++){
            int found = 0;
            for(int j = i-1;j>=0;j--){
                if (arr[i] == arr[j]){
                    found = 1;
                    break;
                }
            }
            if (found==0){
                System.out.print(arr[i] +  " ");
            }
        }
    }
}
