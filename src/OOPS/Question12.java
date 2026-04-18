package OOPS;

class Sample{
    void show(){
        System.out.println("Hello");
    }
}

public class Question12 {
    public static Sample getobject(){
        Sample obj = new Sample();
        return obj;
    }
    public static void main(String[] args){
        Sample s = getobject();
        s.show();
    }
}
