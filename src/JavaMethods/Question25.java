package JavaMethods;

import java.util.Scanner;

public class Question25 {
    //Frequency
    int frequency(int[] arr, int b){
        int count = 0;
        for (int e : arr){
            if (e==b) count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question25 q = new Question25();
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Number : ");
        int b = sc.nextInt();
        int count = q.frequency(arr,b);
        System.out.println("Frequency of " +a + " : " + count);
    }
}
