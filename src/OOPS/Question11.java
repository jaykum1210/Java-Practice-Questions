package OOPS;

class Animal{
    String name;
    void setName(String name){
        this.name = name;
    }
    void eat(){
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println(name + " is barking");
    }
}

public class Question11 {
    public static void main(String[] args){
        Dog d = new Dog();
        d.setName("Bruno");
        d.eat();
        d.bark();
    }
}
