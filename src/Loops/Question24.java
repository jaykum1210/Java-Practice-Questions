package Loops;

import java.util.Scanner;

public class Question24 {
    //Right Shift
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Position : ");
        int b = sc.nextInt();
        int count = 0;
        int x = a;
        while (x>0){
            count++;
            x/=10;
        }
        int temp = 0;
        int rest = count - (b%count);
        int i = 0;
        while (i<rest){
            int c = a%10;
            temp = c*(int)Math.pow(10,i) + temp;
            a/=10;
            i++;
        }
        if (a!=0){
            int j = 1;
            while (j<=b){
                int c = ((a/(int)Math.pow(10,(b - (j++)))))%10;
                temp = temp*10 + c;
            }
        }
        System.out.println("Number : " + temp);
    }
}
