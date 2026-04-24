package Class_Object;

class Rectangle{
    int width;
    int breadh;
    Rectangle(){
        width = 1;
        breadh = 1;
    }
}

public class Question4 {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        System.out.println("Width : " + r.width);
        System.out.println("Breadth : " + r.breadh);
    }
}
