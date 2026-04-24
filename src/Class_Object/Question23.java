package Class_Object;

abstract class Shape{
    abstract double area();
}

class Circle1 extends Shape{
    int radius;
    Circle1(int radius){
        this.radius = radius;
    }
    double area(){
        return 3.14*radius*radius;
    }
}

class Square extends Shape{
    int side;
    Square(int side){
        this.side = side;
    }
    double area(){
        return side*side;
    }
}

public class Question23 {
    public static void main(String[] args){
        Circle1 c = new Circle1(10);
        Square sq = new Square(20);
        System.out.println("Area : " + c.area());
        System.out.println("Area : " + sq.area());
    }
}
