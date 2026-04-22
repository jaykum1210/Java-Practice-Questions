package OOPS;

class Point{
    int a, b;
    Point(int a, int b){
        this.a = a;
        this.b = b;
    }
    public String toString(){
        return "Point(" + a + ", " + b + ")";
    }
}

public class Question10 {
    public static void main(String[] args){
        Point p = new Point(10,20);
        System.out.println(p);
    }
}
