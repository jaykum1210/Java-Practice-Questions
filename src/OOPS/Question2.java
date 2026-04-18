package OOPS;

class Student1{
    String name;
    int age;
    Student1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Question2 {
    //Constructor
    public static void main(String[] args){
        Student1 s = new Student1("Jay",10);
        s.display();
    }
}
