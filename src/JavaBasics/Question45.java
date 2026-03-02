package JavaBasics;

import java.util.Scanner;

public class Question45 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float d = (float)(a+b+c)/3;
        System.out.println(d);
    }
}
