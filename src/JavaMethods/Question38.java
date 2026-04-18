package JavaMethods;

import java.util.Scanner;

public class Question38 {
    //Product Except Self
    int[] multiply(int[] arr, int len){
        int[] temp = new int[len];
        for (int i = 0;i<len;i++){
            int mul = 1;
            for (int j = 0;j<len-1;j++){
                mul*=arr[(j+i+1)%len];
            }
            temp[i] = mul;
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question38 q = new Question38();
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int[] temp = q.multiply(arr,a);
        System.out.print("Array : ");
        for (int e : temp){
            System.out.print(e + " ");
        }
    }
}
