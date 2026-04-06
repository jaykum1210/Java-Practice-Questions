package OneDArray;

import java.util.Scanner;

public class Question9 {
    //Alternating Elements
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array : ");
        for (int i = 0;i<a;i+=2){
            System.out.print(arr[i] + " ");
        }
    }
}
