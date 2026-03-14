package String;

import java.util.Scanner;

public class Question35 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        int count = 0;
        int len = a.length();
        for (int i = 0;i<len;i++){
            char c = a.charAt(i);
            if (c == '('){
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        if (count==0){
            System.out.println("Balanced");
        }
        else System.out.println("Not Balanced");
    }
}
