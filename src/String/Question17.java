package String;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        for (int i = 0;i<a.length()-1;i++){
            char b = a.charAt(i);
            boolean x = true;
            for (int j = i-1;j>=0;j--){
                char c = a.charAt(j);
                if (b == c){
                    x = false;
                    break;
                }
            }
            if (x){
                for (int j = i+1;j<a.length();j++){
                    char d = a.charAt(j);
                    if (b == d){
                        System.out.println(b);
                        break;
                    }
                }
            }
        }
    }
}
