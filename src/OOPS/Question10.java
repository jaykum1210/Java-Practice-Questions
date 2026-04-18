package OOPS;

//Constructor Overloading

class Const{
    Const(){
        System.out.println("Constructor");
    }
    Const(String name){
        System.out.println("Name : " + name);
    }
}

public class Question10 {
    public static void main(String[] args){
        Const c = new Const();
        Const c1 = new Const("Jay");
    }
}
