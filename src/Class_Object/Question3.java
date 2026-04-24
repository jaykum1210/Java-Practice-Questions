package Class_Object;

class Car{
    String brand;
    int speed;
    Car(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }
}

public class Question3 {
    public static void main(String[] args){
        Car c = new Car("Rolls Royce",100);
        System.out.println("Brand : " + c.brand);
        System.out.println("Speed : " + c.speed);
    }
}
