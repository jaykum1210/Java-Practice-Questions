package Class_Object;

class Fruit{
    String name;
    Fruit(String name){
        this.name = name;
    }
}

public class Question17 {
    public static void main(String[] args){
        Fruit[] f = new Fruit[3];
        f[0] = new Fruit("Apple");
        f[1] = new Fruit("Orange");
        f[2] = new Fruit("Banana");
        for (int i = 0;i<3;i++){
            System.out.println(f[i].name);
        }
    }
}
