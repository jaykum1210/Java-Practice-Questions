package Class_Object;

class Student{
    String name;
    int age;
    char Grade;
}

public class Question2 {
    public static void main(String[] args){
        Student s = new Student();
        s.name = "Jay";
        s.age = 20;
        s.Grade = 'A';
        System.out.println("Name : " + s.name);
        System.out.println("Age : " + s.age);
        System.out.println("Grade : " + s.Grade);
    }
}
