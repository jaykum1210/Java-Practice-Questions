package Array;

import java.util.Scanner;

public class Question39 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Two Numbers : ");
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 1;
        int min = a;
        for (int i = 0; i < a; i++){
            if (arr[i] == b || arr[i] == c){
                if (count != 1 && count < min)
                    min = count;
                count = 1;
            }
            else{
                count++;
            }
        }
        System.out.println(min);
    }
}