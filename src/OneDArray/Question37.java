package OneDArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Question37 {
    // Rearrange Positive Negative
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int e : arr){
            if (e >= 0){
                pos.add(e);
            } else {
                neg.add(e);
            }
        }
        int x = 0, y = 0, i = 0;
        while (y < pos.size() && x < neg.size()){
            arr[i++] = pos.get(y++);
            arr[i++] = neg.get(x++);
        }
        while (y < pos.size()){
            arr[i++] = pos.get(y++);
        }
        while (x < neg.size()){
            arr[i++] = neg.get(x++);
        }
        System.out.println("Array : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}