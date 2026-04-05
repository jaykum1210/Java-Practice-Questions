package Loops;

import javax.swing.plaf.IconUIResource;
import java.io.OutputStream;
import java.util.Scanner;

public class Question48 {
    //Non Repeating Value
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int num = 0;
        int i = 0;
        int count = 0;
        while (a>0){
            int b = a%10;
            int temp = num;
            boolean flag = true;
            while (temp>0){
                if (b == temp%10){
                    flag = false;
                    break;
                }
                temp/=10;
            }
            if (flag){
                num = b*(int)Math.pow(10,i++) + num;
                count++;
            }
            a/=10;
        }
        System.out.println("Numbers : " + count);
    }
}
