package Array;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array 1 : ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        System.out.println("Enter "+ a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Size of Array 2 : ");
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        System.out.println("Enter "+ b + " Elements : ");
        for (int i = 0;i<b;i++){
            arr2[i] = sc.nextInt();
        }
        for (int i = 0;i<a;i++){
            System.out.println(arr1[i]);
        }
        for (int i = 0;i<b;i++){
            boolean c = false;
            for (int j = 0;j<a;j++){
                if (arr2[i]==arr1[j]){
                    c = true;
                    break;
                }
            }
            if (!c){
                System.out.println(arr2[i]);
            }
        }
    }
}
