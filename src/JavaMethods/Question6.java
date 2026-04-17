package JavaMethods;

import java.util.Scanner;

public class Question6 {
    // String Length
    public int length(String str){
        int len = 0;
        while (true){
            try{
                str.charAt(len);
                len++;
            }
            catch (Exception e){
                break;
            }
        }
        return len;
    }
    // String Length
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question6 q = new Question6();
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int len = q.length(str);
        System.out.println("length : " + len);
    }
}
