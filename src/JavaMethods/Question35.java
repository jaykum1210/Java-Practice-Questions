package JavaMethods;

import java.util.Scanner;

public class Question35 {
    //Sliding Window
    int sum(int[] arr, int len,int b){
        int max = 0;
        for (int i = 0;i<len-b;i++){
            int num = 0;
            for (int j = i;j<i+b;j++){
                num+=arr[j];
            }
            if(num>max) max = num;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question35 q = new Question35();
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Window Size : ");
        int b = sc.nextInt();
        int max = q.sum(arr,a,b);
        System.out.println("Maximum Sum : " + max);
    }
}
