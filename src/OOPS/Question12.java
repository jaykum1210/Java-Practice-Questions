package OOPS;

class Rectangle{
    int length;
    int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    int area(){
        return breadth*length;
    }
}

public class Question12 {
    public static void main(String[] args){
        Rectangle r = new Rectangle(8,5);
        System.out.println(r.area());
    }
}
