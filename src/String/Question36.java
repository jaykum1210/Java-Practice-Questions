package String;

import java.util.Scanner;

public class Question36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String a = sc.nextLine();
        System.out.println("Enter Second String : ");
        String b = sc.nextLine();
        int len1 = a.length();
        int len2 = b.length();
        for (int i = 0;i<len1;i++){
            boolean x = true;
            for (int j = i-1;j>=0;j--){
                if (a.charAt(i)==a.charAt(j)){
                    x = false;
                }
            }
            if (x){
                for (int j = 0;j<len2;j++){
                    if (a.charAt(i)==b.charAt(j)){
                        System.out.println(a.charAt(i) + " ");
                    }
                }
            }
        }
    }
}
