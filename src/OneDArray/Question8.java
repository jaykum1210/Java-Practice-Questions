package OneDArray;

import java.util.Scanner;

public class Question8 {
    //Sum of Even Index
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        int sum = 0;
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<a;i+=2){
            sum+=arr[i];
        }
        System.out.println("Sum : " + sum);
    }
}
