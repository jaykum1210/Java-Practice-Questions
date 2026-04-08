package OneDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question50 {
    //Sliding Window Max
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Numebr : ");
        int b = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i<=a-b;i++){
            int max = 0;
            for (int j = i;j<i+b;j++){
                if (arr[j]>max){
                    max = arr[j];
                }
            }
            list.add(max);
        }
        System.out.println(list);
    }
}
