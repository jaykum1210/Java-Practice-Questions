package Class_Object;

class Vehicle {
    String brand;
    Vehicle(String brand) {
        this.brand = brand;
    }
    void printBrand(Vehicle v) {
        if (v == null) {
            System.out.println("No vehicle provided");
        } else {
            System.out.println(v.brand);
        }
    }
}
public class Question20 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota");
        Vehicle v2 = null;
        v1.printBrand(v1);
        v1.printBrand(v2);
    }
}