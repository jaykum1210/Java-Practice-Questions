package OOPS;

class Person{
    private int age;
    public void setAge(int age){
        if (age>=0){
            this.age = age;
        }
        else{
            System.out.println("Invalid Age");
        }
    }
    public int getAge(){
        return age;
    }
}

public class Question5 {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setAge(100);
        System.out.println("Age : " + p1.getAge());
        p2.setAge(-5);
        System.out.println("Age : " + p2.getAge());

    }
}
