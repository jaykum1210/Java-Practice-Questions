package Strings2;

import java.util.Scanner;

public class Question12 {
    public static boolean capitalization(String str) {
        int len = str.length();
        int upper = 0;
        int low = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upper++;
            } else {
                low++;
            }
        }
        if (upper == len || low == len || (upper == 1 && str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')) {
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("capitalization : " + capitalization(str));
    }
}
