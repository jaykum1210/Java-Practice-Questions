package JavaMethods;

import java.util.Scanner;

public class Question9 {
    int vowels(String str){
        int len = str.length();
        int count = 0;
        for (int i = 0;i<len;i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question9 q = new Question9();
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int num = q.vowels(str);
        System.out.println("Number of Vowels : " + num);
    }
}
