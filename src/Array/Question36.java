package Array;

import java.util.Scanner;

public class Question36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int count = 1;
        for (int i = 1;i<a;i++){
            boolean b = true;
            for (int j = i-1;j>=0;j--){
                if(arr[i] == arr[j]){
                    b = false;
                    break;
                }
            }
            if (b){
                count++;
            }
        }
        System.out.println(count);
    }
}
