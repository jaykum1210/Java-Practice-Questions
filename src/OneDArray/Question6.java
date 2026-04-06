package OneDArray;

import java.util.Scanner;

public class Question6 {
    //Search Element
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " +a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Number : ");
        int b = sc.nextInt();
        for (int e : arr){
            if (e==b){
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
    }
}
