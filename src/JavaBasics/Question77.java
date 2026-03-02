package JavaBasics;

import java.util.Scanner;

public class Question77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String z = ((a%2)==0)?"Even":"Odd";
        System.out.println(z);
    }
}
