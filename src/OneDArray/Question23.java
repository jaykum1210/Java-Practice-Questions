package OneDArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Question23 {
    //Intersection
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array 1 : ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        System.out.println("Enter " + a + " Elements of Array 1 : ");
        for (int i = 0;i<a;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Size of Array 2 : ");
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        System.out.println("Enter " + b + " Elements of Array 2 : ");
        for (int i = 0;i<b;i++){
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i<a;i++){
            for (int j = 0;j<b;j++){
                if (arr1[i]== arr2[j]){
                    list.add(arr1[i]);
                }
            }
        }
        System.out.println(list);
    }
}
