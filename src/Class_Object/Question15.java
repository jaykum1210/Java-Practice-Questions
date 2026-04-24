package Class_Object;

class Animal1{
    void speak(){
        System.out.println("Speak Something");
    }
}

class Dog1 extends Animal1{
    void speak(){
        System.out.println("Woof!");
    }
}

public class Question15 {
    public static void main(String[] args){
        Dog1 d = new Dog1();
        d.speak();
    }
}
