package OOPS;

import java.util.Scanner;

class Student4{
    String name;
    int age;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Question6 {
    //Getter and Setter
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student4 s = new Student4();
        s.setName("Jay");
        s.setAge(10);
        System.out.println("Name : " + s.getName());
        System.out.println("Age : " + s.getAge());
        s.display();
    }
}
