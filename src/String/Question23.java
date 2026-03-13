package String;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        int count = 0;
        for (int i = 0;i<a.length();i++){
            char c = a.charAt(i);
            if (!((c>=65 && c<=90) || (c>=97 && c<=122) || (c>='0' && c<='9') || (c==' '))){
                count++;
            }
        }
        System.out.println(count);
    }
}
