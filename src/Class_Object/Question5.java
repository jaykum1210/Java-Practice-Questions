package Class_Object;

import java.util.Scanner;

class Rectangle1{
    int width;
    int breadth;
    int area(){
        return width*breadth;
    }
}

public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle1 r = new Rectangle1();
        System.out.println("Enter Width : ");
        int width = sc.nextInt();
        System.out.println("Enter Breadth : ");
        int breadth = sc.nextInt();
        r.width = width;
        r.breadth = breadth;
        System.out.println("Area : " + r.area());
    }
}
