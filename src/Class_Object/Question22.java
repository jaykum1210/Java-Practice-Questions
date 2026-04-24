package Class_Object;

class Builder{
    String name;
    int age;
    Builder setName(String name){
        this.name = name;
        return this;
    }
    Builder setAge(int age){
        this.age = age;
        return this;
    }
}

public class Question22 {
    public static void main(String[] args){
        Builder b = new Builder();
        b.setName("Jay").setAge(10);
        System.out.println("Name : " + b.name);
        System.out.println("Age : " + b.age);
    }
}
