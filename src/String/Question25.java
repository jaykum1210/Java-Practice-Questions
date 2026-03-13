package String;

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        String result = "";
        int end = a.length();
        int i = a.length() - 1;
        while(i >= 0){
            if(a.charAt(i) == ' '){
                for(int j = i+1; j < end; j++){
                    result = result + a.charAt(j);
                }
                result = result + " ";
                end = i;
            }
            else if(i == 0){
                for(int j = i; j < end; j++){
                    result = result + a.charAt(j);
                }
            }
            i--;
        }
        a = result;
        System.out.println("Reversed Sentence : " + a);
    }
}