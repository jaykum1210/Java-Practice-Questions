package OOPS;

class Animal1{
    public void makesound(){
        System.out.println("Some Sound");
    }
}

class Dog1 extends Animal1{
    public void makesound(){
        System.out.println("Woof");
    }
}

class Cat extends Animal1{
    public void makesound(){
        System.out.println("Meow");
    }
}

public class Question16 {
    public static void main(String[] args){
        Animal1 a1 = new Dog1();
        Animal1 a2 = new Cat();
        a1.makesound();
        a2.makesound();
    }
}
