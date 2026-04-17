package JavaMethods;

import java.util.Scanner;

public class Question23 {
    //Reverse
    int reverse(int num){
        int rev = 0;
        while (num>0){
            int b = num%10;
            rev = rev*10 + b;
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question23 q = new Question23();
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        System.out.println("Reverse Number : " + q.reverse(num));
    }
}
