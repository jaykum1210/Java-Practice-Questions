package OneDArray;

import java.util.Scanner;

public class Question4 {
    //Count Even Numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int len = sc.nextInt();
        int count = 0;
        int[] arr = new int[len];
        for (int i = 0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<len;i++){
            if (arr[i]%2==0){
                count++;
            }
        }
        System.out.println("Number of Even Numbers : " + count);
    }
}
