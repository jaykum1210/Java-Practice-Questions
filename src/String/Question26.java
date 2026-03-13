package String;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        for (char i = 'a';i<='z';i++){
            boolean x = false;
            for (int j = 0;j<a.length();j++){
                char c = Character.toLowerCase(a.charAt(j));
                if (i == c){
                    x = true;
                    break;
                }
            }
            if (!x){
                System.out.println("Not a Pangram");
                return;
            }
        }
        System.out.println("Pangram");
    }
}
