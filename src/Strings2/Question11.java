package Strings2;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int len = str.length();
        int left = 0,right = len-1;
        char[] arr = str.toCharArray();
        while (left<=right){
            char c = arr[left];
            char d = arr[right];
            if (((c>='a' && c<='z') || (c>='A' && c<='Z')) && ((d>='a' && d<='z') || (d>='A' && d<='Z'))){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                left++;
            }
            else{
                right--;
            }
        }
        str = new String(arr);
        System.out.println("String : " + str);
    }
}
