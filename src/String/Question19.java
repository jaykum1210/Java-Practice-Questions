package String;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        int max = 0;
        int count;
        char maxchar = '\0';
        for (int i = 0;i<a.length()-1;i++){
            char b = a.charAt(i);
            count = 0;
            for (int j = i+1;j<a.length();j++){
                char c = a.charAt(j);
                if (b == c){
                    count++;
                }
            }
            if (count>max){
                max = count;
                maxchar = b;
            }
        }
        System.out.println(maxchar);
    }
}
