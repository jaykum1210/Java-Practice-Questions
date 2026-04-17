package JavaMethods;

import java.util.Scanner;

public class Question15 {
    float average(int[] arr){
        int len = arr.length;
        int sum = 0;
        for (int i = 0;i<len;i++){
            sum+=arr[i];
        }
        return (float) sum/len;
    }
    //Average of Array
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question15 q = new Question15();
        System.out.println("Enter Size : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter " + len + " Elements : ");
        for (int i = 0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        float Average = q.average(arr);
        System.out.println("Average Element : " + Average);
    }
}
