package Conditional;

import java.util.Scanner;

public class Question3 {
    //Online Shopping Discount
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount : ");
        int amo = sc.nextInt();
        float dis = 0;
        if (amo>=5000){
            dis = amo*0.2f;
        } else if (amo >= 2000) {
            dis = amo*0.1f;
        }
        else{
            dis = 0;
        }
        System.out.println("Final Amount : " + (amo-dis));
    }
}
