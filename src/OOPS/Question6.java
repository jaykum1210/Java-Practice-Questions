package OOPS;

class Circle{
    int radius;
    public void setRadius(int radius){
        this.radius = radius;
    }
    public float area(){
        return (float) 3.14f*radius*radius;
    }
}

public class Question6 {
    public static void main(String[] args){
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println("Area : " + c.area());
    }
}
