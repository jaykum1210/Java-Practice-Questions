package OOPS;

class Vehicle{
    int speed;
    Vehicle(int speed){
        this.speed = speed;
    }
    public void info(){
        System.out.println("Speed : " + speed);
    }
}

class Bike extends Vehicle{
    int gears;
    Bike(int speed,int gears){
        super(speed);
        this.gears = gears;
    }
    public void info(){
        super.info();
        System.out.println("Gears : " + gears);
    }
}

public class Question17 {
    public static void main(String[] args){
        Bike b = new Bike(100,10);
        b.info();
    }
}
