package String;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        for (int i = 0;i<a.length();i++){
            char b = a.charAt(i);
            boolean x = true;
            for (int j = i-1;j>=0;j--){
                if (b == a.charAt(j)){
                    x = false;
                    break;
                }
            }
            if (x){
                System.out.print(b);
            }
        }
    }
}
