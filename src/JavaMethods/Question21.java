package JavaMethods;

import java.util.Scanner;

public class Question21 {
    //Count Digit
    int count(int num){
        int digit = 0;
        while (num>0){
            digit++;
            num/=10;
        }
        return digit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question21 q = new Question21();
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        System.out.println("Digits : " + q.count(num));
    }
}
