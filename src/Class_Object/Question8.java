package Class_Object;

class Circle{
    int radius;
    Circle(){
        this.radius = 1;
    }
    Circle(int radius){
        this.radius = radius;
    }
}

public class Question8 {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);
        System.out.println("Radius : " + c1.radius);
        System.out.println("Radius : " + c2.radius);
    }
}
