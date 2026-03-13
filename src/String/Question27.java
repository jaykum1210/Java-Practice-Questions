package String;

import java.util.Scanner;

public class Question27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        int len = a.length();
        int count = 0;
        int max = 0;
        int i = 0;
        String temp = "";
        int start = 0;
        while (i < len){
            char c = a.charAt(i);
            if (c == ' ' || i == len-1){
                if(i == len-1) count++;
                if (count > max){
                    max = count;
                    temp = "";
                    for (int j = start; j < start + count; j++){
                        temp = temp + a.charAt(j);
                    }
                }
                start = i + 1;
                count = 0;
            }
            else{
                count++;
            }
            i++;
        }
        System.out.println(temp);
    }
}