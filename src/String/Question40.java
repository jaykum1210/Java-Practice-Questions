package String;

import java.util.Scanner;

public class Question40 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        char[] arr = a.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len - 1; i++){
            for (int j = 0; j < len - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        String result = new String(arr);
        System.out.println(result);
    }
}