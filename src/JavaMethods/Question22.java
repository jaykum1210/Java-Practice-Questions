package JavaMethods;

import java.util.Scanner;

public class Question22 {
    //Sum of Diggits
    int Sum(int num){
        int sum = 0;
        while (num>0){
            int b = num%10;
            sum+=b;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question22 q = new Question22();
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        System.out.println("Sum : " + q.Sum(num));
    }
}
