package Class_Object;

class Point{
    int x,y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    static double distance(Point a, Point b){
        int dx = b.x - a.x;
        int dy = b.y - a.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class Question10 {
    public static void main(String[] args){
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        double result = Point.distance(p1,p2);
        System.out.println("Distance : " + result);
    }
}
