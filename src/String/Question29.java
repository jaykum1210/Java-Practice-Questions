package String;

import java.util.Scanner;

public class Question29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        System.out.println("Enter Substring : ");
        String b = sc.nextLine();
        int count = 0;
        for (int i = 0;i<a.length()-1;i++){
            char c = a.charAt(i);
            boolean x = true;
            if (c == b.charAt(0)){
                for (int j = 1;j<b.length();j++){
                    if (a.charAt(i+j) != b.charAt(j)){
                        x = false;
                        break;
                    }
                }
                if (x){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
