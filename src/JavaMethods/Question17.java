package JavaMethods;

import java.util.Scanner;

public class Question17 {
    //LCM
    int lcm(int a, int b){
        int max = a;
        int min = b;
        if (b>max){
            max = b;
            min = a;
        }
        for (int i = 1;;i++){
            if ((max*i)%min==0){
                return (max*i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Question17 q = new Question17();
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = q.lcm(a,b);
        System.out.println("LCM : " + num);
    }
}
