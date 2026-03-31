package Conditional;

import java.util.Scanner;

public class Question18 {
    //Time Conversion
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hour : ");
        int a = sc.nextInt();
        if (a<12){
            System.out.println(a + " AM");
        }
        else System.out.println((a%12) + " PM");
    }
}
