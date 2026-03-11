package Array;

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<a;i++){
            if(i%2==0 && arr[i]<0){
                for(int j = i+1;j<a;j++){
                    if(arr[j]>0){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
            else if(i%2==1 && arr[i]>0){
                for(int j = i+1;j<a;j++){
                    if(arr[j]<0){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println("Array : ");
        for(int i = 0;i<a;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
