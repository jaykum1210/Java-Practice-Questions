package OOPS;

import java.util.Scanner;

class Student{
    String name;
    int age;
    public void setter(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        stu.setter(name,age);
        stu.display();
    }
}
