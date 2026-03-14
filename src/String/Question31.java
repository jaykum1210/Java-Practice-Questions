package String;

import java.util.Scanner;

public class Question31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String temp = a;
        a = "";
        int len = temp.length();
        for (int i = 0;i<len;i++){
            int count = 1;
            char c = temp.charAt(i);
            boolean x = true;
            for (int j = i-1;j>=0;j--){
                if (c == temp.charAt(j)){
                    x = false;
                    break;
                }
            }
            if (x){
                for (int j = i+1;j<len;j++){
                    if (c == temp.charAt(j)){
                        count++;
                    }
                }
                a += (c + "" +  count);
            }
        }
        System.out.println(a);
    }
}
