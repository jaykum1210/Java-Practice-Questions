package Class_Object;

class Laptop{
    String brand;
    int price;
    Laptop(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    Laptop(Laptop obj){
        this.price = obj.price;
        this.brand = obj.brand;
    }
}

public class Question18 {
    public static void main(String[] args){
        Laptop l1 = new Laptop("Jay",10000);
        Laptop l2 = new Laptop(l1);
        System.out.println("Original : " + l1.brand + " " + l1.price);
        System.out.println("Copy : " + l2.brand + " " + l2.price);
    }
}
