package OOPS;

class Student3{
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

public class Question5 {
    //Class and Object
    public static void main(String[] args){
        Student3 s = new Student3();
        s.setter("Jay",20);
        s.display();
    }
}
