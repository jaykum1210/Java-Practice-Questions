package Conditional;

import java.util.Scanner;

public class Question25 {
    //Electricity
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Unit : ");
        int a = sc.nextInt();
        int bill = 0;
        if (a<=100){
            bill = a*5;
        } else if (a <= 200) {
            bill = 500+(a-100)*7;
        }
        else{
            bill = 500 + 700 + (a-200)*10;
        }
        System.out.println("Bill : " + bill);
    }
}
