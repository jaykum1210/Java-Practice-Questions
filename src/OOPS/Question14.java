package OOPS;

class Overriding{
    private String name;
    private int age;
    public void setter(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return (name + " " + age);
    }
}

public class Question14 {
    //Override Tostring Function
    public static void main(String[] args){
        Overriding or = new Overriding();
        or.setter("Jay",20);
        System.out.println(or);
    }
}
