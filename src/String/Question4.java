package String;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        int count = 0;
        for (int i = 0;i<a.length();i++){
            char c = Character.toLowerCase(a.charAt(i));
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')){
                count++;
            }
        }
        System.out.println("Number of Vowels : " + count);
    }
}
