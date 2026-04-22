package OOPS;

interface Greettable{
    public void greet();
}

class Student1 implements Greettable{
    String name;
    void setName(String name){
        this.name = name;
    }
    public void greet(){
        System.out.println("Hello, I am " + name);
    }
}

public class Question14 {
    public static void main(String[] args){
        Student1 s = new Student1();
        s.setName("Jay");
        s.greet();
    }
}
