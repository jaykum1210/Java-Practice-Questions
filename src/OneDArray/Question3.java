package OneDArray;

import java.util.Scanner;

public class Question3 {
    //Minimum Element
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter " + " Elements : ");
        for (int i = 0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        int min = 9999999;
        for (int e : arr){
            if (e<min) min = e;
        }
        System.out.println("Minimum Element : " + min);
    }
}
