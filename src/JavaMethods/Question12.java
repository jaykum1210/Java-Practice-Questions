package JavaMethods;

import java.util.Scanner;

public class Question12 {
    String palindrome(int num){
        int ori = num;
        int temp = 0;
        while (num>0){
            int b = num%10;
            temp = temp*10 + b;
            num/=10;
        }
        if (temp==ori){
            return "Palindrome";
        }
        return "Not A Palindrome";
    }
    //Palindrome Check
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question12 q = new Question12();
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println(q.palindrome(a));
    }
}
