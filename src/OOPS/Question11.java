package OOPS;

class Objects{
    private String name;
    private int age;
    public void setters(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void displays(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Question11 {
    //Object as Parameter
    public static void display(Objects obj){
        obj.displays();
    }
    public static void main(String[] args){
        Objects obj = new Objects();
        obj.setters("Jay",10);
        display(obj);
    }
}
