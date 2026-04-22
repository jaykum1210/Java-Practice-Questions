package OOPS;

abstract class Shape{
    abstract int area();
}

class Square extends Shape{
    int side;
    public void setSide(int side){
        this.side = side;
    }
    int area(){
        return side*side;
    }
}

public class Question13 {
    public static void main(String[] args){
        Square sq = new Square();
        sq.setSide(10);
        System.out.println("Area : " + sq.area());
    }
}
