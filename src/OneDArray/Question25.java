package OneDArray;

import java.util.Scanner;

public class Question25 {
    //Pair Sum
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Sum : ");
        int b = sc.nextInt();
        int start = 0;
        int end = a-1;
        while (start<end){
            if ((arr[start] + arr[end])==b){
                System.out.println("Found");
                return;
            } else if (arr[start] + arr[end] > b) {
                end--;
            }
            else {
                start++;
            }
        }
        System.out.println("Not Found");
    }
}
