package OOPS;

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
    //Class and Object
    public static void main(String[] args){
        Student s = new Student();
        s.setter("Jay",20);
        s.display();
    }
}
