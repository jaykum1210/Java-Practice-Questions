package OOPS;

class Object{
    static int count = 0;
    Object(){
        count++;
    }
}

public class Question7 {
    //Static variable counter
    public static void main(String[] args){
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("Count : " + Object.count);
    }
}
