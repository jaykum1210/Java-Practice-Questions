package JavaMethods;

import java.util.Scanner;

public class Question19 {
    //ArmString Number
    String armstrong(int num){
        int ori = num;
        int sum = 0;
        while (num>0){
            int b = num%10;
            sum+=(b*b*b);
            num/=10;
        }
        if (sum==ori) return "Yes";
        return "No";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question19 q = new Question19();
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        System.out.println(q.armstrong(num));
    }
}
