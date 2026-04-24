package Class_Object;

class Dog{
    static int count = 0;
    Dog(){
        count++;
    }
}

public class Question12 {
    public static void main(String[] args){
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        System.out.println("Count : " + Dog.count);
    }
}
