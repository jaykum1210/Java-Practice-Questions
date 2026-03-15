package String;

import java.util.Scanner;

public class Question41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String a =  sc.nextLine();
        System.out.println("Enter Second String :");
        String b = sc.nextLine();
        int len1 = a.length();
        int len2 = b.length();
        if (len1!=len2){
            System.out.println(false);
            return;
        }
        for(int i = 0; i < len1; i++){
            for(int j = i + 1; j < len1; j++){
                if(a.charAt(i) == a.charAt(j) && b.charAt(i) != b.charAt(j)){
                    System.out.println(false);
                    return;
                }
                if(a.charAt(i) != a.charAt(j) && b.charAt(i) == b.charAt(j)){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}

