package String;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        System.out.println();
        System.out.println("Enter Character : ");
        char b = sc.nextLine().charAt(0);
        String  temp = a;
        a = "";
        for (int i = 0;i<temp.length();i++){
            if (temp.charAt(i)!=b){
                a = a + temp.charAt(i);
            }
        }
        System.out.println("String : " + a);
    }
}
