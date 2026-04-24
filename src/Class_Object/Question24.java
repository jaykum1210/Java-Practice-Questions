package Class_Object;

interface Drawable{
    public void draw();
}

class Circle2 implements Drawable{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

class Triangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Triangle");
    }
}

public class Question24 {
    public static void main(String[] args){
        Circle2 c = new Circle2();
        Triangle t = new Triangle();
        c.draw();
        t.draw();
    }
}
