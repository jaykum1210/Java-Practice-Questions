package JavaMethods;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Question29 {
    //Count Words
    int word(String str){
        int len = str.length();
        int count = 1;
        for (int i = 1;i<len;i++){
            if (str.charAt(i)==' ' && str.charAt(i-1)!=' ') count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question29 q = new Question29();
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int count = q.word(str);
        System.out.println("Words : " + count);
    }
}
