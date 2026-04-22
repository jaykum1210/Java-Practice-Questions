package OOPS;

class Phone{
    String brand;
    int price;
    Phone(){
        brand = "Unknown";
        price = 0;
    }
    public void display(){
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.display();
    }
}
