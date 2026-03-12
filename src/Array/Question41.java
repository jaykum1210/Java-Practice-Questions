package Array;

import java.util.Scanner;

public class Question41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[a];
        System.out.println("Enter " + a + " Elements of Array 1: ");
        for (int i = 0;i<a;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter " + a + " Elements of Array 2: ");
        for (int i = 0;i<a;i++){
            arr2[i] = sc.nextInt();
        }
        for (int i = 0;i<a;i++){
            if (arr1[i]!=arr2[i]){
                System.out.println("Not Equal");
                return;
            }
        }
        System.out.println("Equal");
    }
}
