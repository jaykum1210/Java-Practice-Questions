package Conditional;

import java.util.Scanner;

public class Question6 {
    // Bonus
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        int a = sc.nextInt();
        System.out.println("Enter Years of Experience : ");
        int b = sc.nextInt();
        float salary = 0;
        if (b>=5){
            salary = a + (0.2f*a);
        } else if (b >= 2) {
            salary = a + (0.1f*a);
        }
        else {
            salary = a + (0.05f*a);
        }
        System.out.println("Salary : " + salary);
    }
}
