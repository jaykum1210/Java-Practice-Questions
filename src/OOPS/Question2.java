package OOPS;

import java.util.Scanner;

class Car{
    private String brand;
    private int speed;
    Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    public void display(){
        System.out.println("Brand Name : " + brand);
        System.out.println("Speed : " + speed);
    }
}

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car("Toyota",180);
        Car c2 = new Car("BMW",240);
        c1.display();
        c2.display();
    }
}
