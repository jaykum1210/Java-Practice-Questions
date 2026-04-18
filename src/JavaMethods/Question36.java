package JavaMethods;

import java.util.Scanner;

public class Question36 {
    //Longest SubString
    int substring(String str){
        int len = str.length();
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<len-1;i++){
            char ch = str.charAt(i);
            char d = str.charAt(i+1);
            if (d-ch==1){
                count++;
                if (count>max) max = count;
            }
            else {
                count = 1;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question36 q = new Question36();
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int max = q.substring(str);
        System.out.println("Maximum Substring : " + max);
    }
}
