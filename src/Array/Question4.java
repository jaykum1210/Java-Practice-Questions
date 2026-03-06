package Array;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Numbers : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0;i<a;i++){
            if (arr[i]%2==0){
                count++;
            }
        }
        System.out.println("Number of even Numbers : " + count);
    }
}
