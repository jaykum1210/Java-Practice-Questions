package JavaMethods;

import java.util.Scanner;

public class Question11 {
    String prime(int a){
        for (int i = 2;i<=a/2;i++){
            if (a%2==0) return "Not Prime";
        }
        return "Prime";
    }
    //Prime Check
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question11 q = new Question11();
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println(q.prime(a));
    }
}
