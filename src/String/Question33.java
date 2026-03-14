package String;

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        int len = a.length();
        for (int i = 0;i<len;i++){
            for (int j = i;j<len;j++){
                System.out.println(a.substring(i,j+1));
            }
        }
    }
}
