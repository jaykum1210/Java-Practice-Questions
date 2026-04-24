package Class_Object;

class Greet{
    void sayHello(){
        System.out.println("Hello, World!");
    }
}

public class Question1 {
    public static void main(String[] args){
        Greet g = new Greet();
        g.sayHello();
    }
}
