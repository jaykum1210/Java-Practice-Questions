package JavaMethods;

import java.util.Scanner;

public class Question20 {
    //Perfect Number
    String perfect(int num){
        int sum = 1;
        for (int i = 2;i<=num/2;i++){
            if (num%i==0) sum+=i;
        }
        if (sum==num) return "Yes";
        return "No";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question20 q = new Question20();
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        System.out.println(q.perfect(num));
    }
}
