package OneDArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Question17 {
    //Remove Duplicates
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i<a;i++){
            int b = arr[i];
            boolean flag = true;
            for (int j = i-1;j>0;j--){
                if (b==arr[j]){
                    flag = false;
                    break;
                }
            }
            if (flag){
                list.add(b);
            }
        }
        System.out.println("Array : " + list);

    }
}
