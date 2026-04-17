package Strings;

import java.util.Scanner;

public class Question1 {
    //Length
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("By Function : " + str.length());
        int count = 0;
        while (true){
            try {
                str.charAt(count);
                count++;
            }
            catch (Exception e){
                break;
            }
        }
        System.out.println("Length : " + count);
    }
}
