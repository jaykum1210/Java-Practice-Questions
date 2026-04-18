package OOPS;

import java.util.Scanner;

class Addition{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class Question9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Addition ad = new Addition();
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum : " + ad.add(a,b));
        System.out.println("Enter Three Numbers : ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.println("Sum : " + ad.add(10,20,30));
    }
}
