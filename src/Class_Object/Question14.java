package Class_Object;

class Color{
    String name;
    Color(String name){
        this.name = name;
    }
    public boolean equals(Object obj){
        Color c = (Color) obj;
        return this.name.equalsIgnoreCase(c.name);
    }
}

public class Question14 {
    public static void main(String[] args){
        Color c1 = new Color("red");
        Color c2 = new Color("Orange");
        System.out.println(c1.equals(c2));
    }
}
