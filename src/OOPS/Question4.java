package OOPS;

class Student2{
    String name;
    int age;
    Student2(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Question4 {
    //Constructor
    public static void main(String[] args){
        Student2 s = new Student2("Jay",10);
        s.display();
    }
}
