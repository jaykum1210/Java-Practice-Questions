package Class_Object;

import java.util.Scanner;

class Temperature{
    int celsius;
    float toFahrenheit(){
        return ((float)(celsius*(9.0f/5))+32);
    }
}

public class Question9 {
    public static void main(String[] args){
        Temperature t = new Temperature();
        Scanner sc = new Scanner(System.in);
        System.out.println("Celsius : ");
        int cel = sc.nextInt();
        t.celsius = cel;
        System.out.println("Fahrenheit : " + t.toFahrenheit());
    }
}
