package JavaBasics;

import java.util.Scanner;

public class Question57 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers : ");
        int a = sc.nextInt();
        System.out.println("Enter Total Numbers : ");
        int b = sc.nextInt();
        float c = ((float)a/b)*100;
        System.out.println(c);
    }
}
